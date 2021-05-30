package com.project.eRashid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.eRashid.daos.OwnerDao;
import com.project.eRashid.dtos.OwnerLogin;
import com.project.eRashid.dtos.VehicleDto;

@RestController
public class TaxModuleController {

	@Autowired
	private OwnerDao adao;
	
	@PostMapping("/ownerPay")
	public void paidByOwner(OwnerLogin owner) {
		adao.payForOwner(owner);
	}
	@GetMapping("/pi/rfid")
	public VehicleDto getVehicleFromRFID(@RequestParam String rfid) {
		return adao.getVehicleForPi(rfid).getVehicle();
	}
	@GetMapping("/pi/qrcode")
	public VehicleDto getVehicleFromQRCode(@RequestParam String qrcode) {
		return adao.getVehicleForPi(qrcode).getVehicle();

	}

}
