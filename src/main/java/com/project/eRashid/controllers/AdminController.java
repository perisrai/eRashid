package com.project.eRashid.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.eRashid.daos.OwnerTransferDao;
import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.dtos.OwnershipTransferDto;
import com.project.eRashid.dtos.VehicleDto;

@Controller
public class AdminController {
	@Autowired
	private VehicleDao vdao;
	@Autowired
	private OwnerTransferDao otdao;

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchVehicle(@RequestParam String vno, Locale locale, Model model,
			@ModelAttribute VehicleDto v) {
		logger.info("searching the directory", locale);
		model.addAttribute("vehicle", new VehicleDto());
		model.addAttribute("vno", v.getVno());
		model.addAttribute("vmodel", v.getVmodel());

		model.addAttribute("results", vdao.searchVehicle(vno));

		return "search";
	}

	@PostMapping("/transferOwnership")
	public String transferOwnership(@ModelAttribute VehicleDto v, Model model) {
		logger.info("ownership transfer, {}", v);

		otdao.saveTransferDetails(v);

		return "home";
	}

	@RequestMapping("/ownertransfer")
	String ownwerTransfer(Model model) {
		logger.info("ownership transfer");
		VehicleDto v = new VehicleDto();
		v.setOwnershipDto(new OwnershipTransferDto());
		model.addAttribute("vehicle", v);
		return "ownertransfer";
	}

}
