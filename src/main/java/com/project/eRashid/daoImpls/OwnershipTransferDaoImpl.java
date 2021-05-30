package com.project.eRashid.daoImpls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.eRashid.controllers.AdminLoginController;
import com.project.eRashid.daos.OwnerTransferDao;
import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.OwnerInfo;
import com.project.eRashid.models.OwnershipTransfer;
import com.project.eRashid.models.Vehicle;
import com.project.eRashid.repos.OwnerRepo;
import com.project.eRashid.repos.TransferOwnershipRepo;
import com.project.eRashid.repos.VehicleRepo;

@Service
public class OwnershipTransferDaoImpl implements OwnerTransferDao {

	private static final Logger Logger = LoggerFactory
			.getLogger(AdminLoginController.class);

	@Autowired
	private VehicleRepo vehicleRepo;
	@Autowired
	private OwnerRepo ownerRepo;
	@Autowired
	private TransferOwnershipRepo transferRepo;
	@Autowired
	private VehicleDao vdao;

	@Override
	@Transactional
	public void saveTransferDetails(VehicleDto v) {

		String vehicleNo = v.getVno();
		Vehicle vehicle = vehicleRepo.findByVno(vehicleNo);
		if (vehicle != null) {
			OwnerInfo newOwner = v.getOwner().getOwner();
			newOwner = ownerRepo.save(newOwner);
			OwnerInfo oldOwner = vehicle.getOwner();

			OwnershipTransfer transfer = new OwnershipTransfer();
			transfer.setPurpose(v.getOwnershipDto().getPurpose());
			transfer.setTransferDate(v.getOwnershipDto().getTransferDate());
			transfer.setNewOwner(newOwner);
			transfer.setOldOwner(oldOwner);
			transfer.setVehicle(vehicle);
			transferRepo.save(transfer);

			vehicle.setOwner(newOwner);
			vehicleRepo.save(vehicle);
		}

		// OwnershipTransfer ot = new OwnershipTransfer();
		// List<OwnershipTransferDto> ownershipTransfer = v.getOwnershipDtos();
		// // transferRepo.saveAll(ownershipTransfer);
		// transferRepo.save(ot);
		//
		// Logger.info(" update1");
		// if (ownershipTransfer != null) {
		// Vehicle vehicle = v.getVehicle();
		// vehicle = vehicleRepo.findByVid(vid);
		// OwnerInfoDto ownerInfo = v.getOwner();
		// OwnerInfo owner = ownerInfo.getOwner();
		// owner.getOid();
		// Logger.info(" update");
		// owner = ownerRepo.save(owner);
		// vehicle.setOwner(owner);
		// vehicleRepo.save(vehicle);
		// transferRepo.save(ot);
		// }
		// else {
		//
		// }
	}
}
