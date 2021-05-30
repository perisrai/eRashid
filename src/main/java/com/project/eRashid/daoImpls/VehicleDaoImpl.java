package com.project.eRashid.daoImpls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.eRashid.controllers.VehicleController;
import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.dtos.OwnerInfoDto;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.OwnerInfo;
import com.project.eRashid.models.Rfid;
import com.project.eRashid.models.Vehicle;
import com.project.eRashid.repos.OwnerRepo;
import com.project.eRashid.repos.VehicleRepo;

@Repository
public class VehicleDaoImpl implements VehicleDao {

	private static final Logger Logger = LoggerFactory.getLogger(VehicleController.class);

	@Autowired
	private VehicleRepo vehicleRepo;
	@Autowired
	private OwnerRepo ownerRepo;

	@Override
	@Transactional
	public List<VehicleDto> searchVehicle(String vno) {

		List<Vehicle> vehicles = vehicleRepo.findByVnoContaining(vno);
		List<VehicleDto> vecs = getVehicles(vehicles);
		return vecs;
		// Vehicle v = new Vehicle();
		// Logger.info("search by vno sucessful");
		// Session session = SessionFactory.openSession();
		// Criteria criteria = session.createCriteria(Vehicle.class);
		// criteria.setFetchMode("CustomDuty", FetchMode.JOIN).setFetchMode("OwnerInfo",
		// FetchMode.JOIN).add(Restrictions.eq("vno", vno));
		// @SuppressWarnings("unchecked")
		// List<Vehicle> results = criteria.list();
		// return results;

	}

	private List<VehicleDto> getVehicles(List<Vehicle> vehicles) {
		List<VehicleDto> vecs = new ArrayList<>();
		for (Vehicle v : vehicles) {
			vecs.add(v.getVehicle());
		}
		return vecs;
	}

	@Override
	@Transactional
	public List<VehicleDto> getAllVehicle() {

		return getVehicles(vehicleRepo.findAll());

		// Session session = SessionFactory.openSession();
		//
		// Criteria c = session.createCriteria(Vehicle.class);
		//
		// c.setFetchMode("CustomDuty", FetchMode.JOIN);
		//
		// c.setFetchMode("OwnerInfo", FetchMode.JOIN);
		// @SuppressWarnings("unchecked")
		// List<Vehicle> vehiclelist = c.list();
		// return vehiclelist;
	}

	@Override
	@Transactional
	public void updateVehicle(VehicleDto v) {
		Logger.info(" update1");
		Vehicle vehicle = v.getVehicle();
		OwnerInfoDto ownerInfo = v.getOwner();
		OwnerInfo owner = ownerInfo.getOwner();
		Logger.info(" update");
		owner = ownerRepo.save(owner);
		vehicle.setOwner(owner);
		Rfid rfid = v.getRfid();
		vehicle.setRfid(rfid);
		
		vehicleRepo.save(vehicle);
	}

	@Override
	@Transactional
	public VehicleDto getById(int vid) {
		return getVehicles(Arrays.asList(vehicleRepo.findById(vid).get())).get(0);
		// Session session = SessionFactory.getCurrentSession();
		// Vehicle v = (Vehicle) session.get(Vehicle.class, vid);
		// Logger.info("calyo");
		// return v;
		// return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.eRashid.daos.VehicleDao#getHistoryById(int)
	 */
	@Override
	public Object getHistoryById(int vid) {

		return vehicleRepo.findByVid(vid).getVehicle();
	}

}
