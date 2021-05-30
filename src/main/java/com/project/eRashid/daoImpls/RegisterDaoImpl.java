package com.project.eRashid.daoImpls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.eRashid.controllers.AdminLoginController;
import com.project.eRashid.daos.RegisterDao;
import com.project.eRashid.dtos.OwnerInfoDto;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.OwnerInfo;
import com.project.eRashid.models.Rfid;
import com.project.eRashid.models.Vehicle;
import com.project.eRashid.repos.OwnerRepo;
import com.project.eRashid.repos.VehicleRepo;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	private static final Logger Logger = LoggerFactory
			.getLogger(AdminLoginController.class);

	
	@Autowired
	private VehicleRepo vehicleRepo;
	@Autowired
	private OwnerRepo ownerRepo;
	
	
	@Override
	@Transactional
	public void registerVehicleInfo(VehicleDto v) {
	
		String vno= v.getZone()+v.getLotno()+v.getType()+v.getVnum();
		
		v.setVno(vno);
		Vehicle vehicle = v.getVehicle();
		Rfid rfid = v.getRfid();
		OwnerInfoDto ownerInfo=v.getOwner();
		OwnerInfo owner=ownerInfo.getOwner();
	    Logger.info(" register");
		owner=ownerRepo.save(owner);		
		vehicle.setOwner(owner);
		vehicle.setRfid(rfid);
		vehicleRepo.save(vehicle);
		 Logger.info(" register vehicle");
		vehicleRepo.save(vehicle);
		
		

	}

}
