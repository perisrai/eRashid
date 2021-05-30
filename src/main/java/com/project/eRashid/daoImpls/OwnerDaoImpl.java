package com.project.eRashid.daoImpls;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.eRashid.daos.OwnerDao;
import com.project.eRashid.dtos.OwnerLogin;
import com.project.eRashid.dtos.TaxDetails;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.OwnerInfo;
import com.project.eRashid.models.Vehicle;
import com.project.eRashid.models.VehicleTax;
import com.project.eRashid.repos.OwnerRepo;
import com.project.eRashid.repos.VehicleRepo;
import com.project.eRashid.repos.VehicleTaxRepo;

/**
 * <<Description Here>>
 * @author 
 * 
 */
@Service
public class OwnerDaoImpl implements OwnerDao {

	@Autowired
	private OwnerRepo ownerRepo;

	@Autowired
	private VehicleRepo vehicleRepo;

	@Autowired
	private VehicleTaxRepo vehicleTaxRepo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.eRashid.daos.OwnerDao#login(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String vno, String psw) {
		OwnerInfo owner = ownerRepo.findByVehicleNoAndPassword(vno, psw);
		return owner != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.eRashid.daos.OwnerDao#getVehicle(java.lang.String)
	 */
	@Override
	public Vehicle getVehicle(String vno) {
		Vehicle vec = vehicleRepo.findByVno(vno);
		return vec;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.eRashid.daos.OwnerDao#getTaxDetails(java.lang.String)
	 */
	@Override
	public TaxDetails getTaxDetails(String vno) {
		Vehicle vehicle = vehicleRepo.findByVno(vno);
		if (vehicle.getVehicleTaxes() == null || vehicle.getVehicleTaxes().isEmpty()) {
			TaxDetails tax = new TaxDetails();
			tax.setAlreadyPaidForCurrentYear(false);
			tax.setLastTaxPaidDate(null);
			tax.setTaxToPay(getTax(vehicle.getCc(), vehicle.getVtype()).getTaxToPay());
		}
		return getTaxInfo(vehicle, vehicle.getVehicleTaxes(), new Date());
	}

	private TaxDetails getTaxInfo(Vehicle vehicle, List<VehicleTax> vehicleTaxes,
			Date forDate) {
		VehicleDto ve = new VehicleDto();
		TaxDetails tax = new TaxDetails();
		tax.setAlreadyPaidForCurrentYear(false);
		tax.setLastTaxPaidDate(null);
		tax.setTaxToPay(getTax(vehicle.getCc(), vehicle.getVtype()).getTaxToPay());
		for (VehicleTax v : vehicleTaxes) {
			if (getYear(v.getPaidDate()) == getYear(forDate)) {
				tax.setAlreadyPaidForCurrentYear(true);
				tax.setLastTaxPaidDate(v.getPaidDate());
				tax.setStatus("Paid");
				tax.setTaxToPay("0");
			}
			else {
				tax.setStatus("Not Paid");
				tax.setLastTaxPaidDate(ve.getRegisteredDate());
			}
		}
		return tax;
	}

	private int getYear(Date date) {
		return LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date)).getYear();

	}

	private TaxDetails getTax(Integer cc, String vtype) {

		TaxDetails tax = new TaxDetails();

		Map<Integer, Integer> wheelers = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});

		if (vtype.equalsIgnoreCase("twoWheeler")) {

			wheelers.put(401, 16500);
			wheelers.put(251, 8800);
			wheelers.put(126, 4400);
			wheelers.put(0, 2750);

		}
		else {
			// Four Wheeler
			wheelers.put(2001, 40700);
			wheelers.put(1501, 25300);
			wheelers.put(1001, 23100);
			wheelers.put(0, 19900);
		}

		for (Map.Entry<Integer, Integer> e : wheelers.entrySet()) {
			if (cc >= e.getKey()) {
				tax.setTaxToPay("" + e.getValue());
				break;
			}
		}
		return tax;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.project.eRashid.daos.OwnerDao#payForOwner(com.project.eRashid.dtos.OwnerLogin)
	 */
	@Override
	public void payForOwner(OwnerLogin owner) {
		Date thisYear = new Date();
		VehicleTax tax = new VehicleTax();
		Vehicle vehicle = vehicleRepo.findByVno(owner.getVno());
		List<VehicleTax> taxes = vehicle.getVehicleTaxes();
		Boolean notPaid = true;
		if (taxes != null && !taxes.isEmpty()) {
			for (VehicleTax v : taxes) {
				if (getYear(thisYear) == getYear(v.getPaidDate())) {
					notPaid = false;
					
				}
			}
		}

		if (notPaid) {
			
			
			tax.setVehicle(vehicle);
			tax.setPaidDate(thisYear);
			tax.setAmount(Integer
					.parseInt(getTax(vehicle.getCc(), vehicle.getVtype()).getTaxToPay()));
			vehicleTaxRepo.save(tax);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.eRashid.daos.OwnerDao#getVehicleForPi(java.lang.String)
	 */
	@Override
	public Vehicle getVehicleForPi(String rfid) {
		return vehicleRepo.findByRfid(rfid);
	}

}
