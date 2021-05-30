package com.project.eRashid.controllers;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.dtos.VehicleDto;

@Controller
public class VehicleController {
	@Autowired
	private VehicleDao vdao;

	private static final Logger logger = LoggerFactory.getLogger(VehicleController.class);

	@RequestMapping(value = "/vehicleDetails", method = RequestMethod.GET)
	public String getAllVehicleDetails(Locale locale, Model model) {
		logger.info("retrieving vehicle details", locale);
		model.addAttribute("vehiclelist", vdao.getAllVehicle());
		logger.info("data all set to display");
		return "vehicleDetails";
	}

	@RequestMapping(value = "/{vid}/edit", method = RequestMethod.GET)
	public String editVehicle(@PathVariable("vid") int vid, Model model,
			HttpSession session) {
		logger.info("search by id");
		model.addAttribute("vehicle", vdao.getById(vid));
		return "editForm";
	}

	@RequestMapping(value = "/{vid}/show-history", method = RequestMethod.GET)
	public String showHistoryOfVehicle(@PathVariable("vid") int vid, Model model,
			HttpSession session) {
		logger.info("showing history of vehicle");
		Object result = vdao.getHistoryById(vid);
		logger.info("{}", result);
		model.addAttribute("vehicle", result);
		return "vehicleHistory";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateVehicle(@ModelAttribute VehicleDto v, Model model,
			HttpSession session) {
		logger.info("update vehicle");
		vdao.updateVehicle(v);
		model.addAttribute("vlist", vdao.getAllVehicle());

		return "adminpage";
	}

}
