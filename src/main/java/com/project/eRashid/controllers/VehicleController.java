package com.project.eRashid.controllers;


import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.models.Vehicle;


@Controller
public class VehicleController {
	@Autowired
	private VehicleDao vdao;
	
	private static final Logger logger = LoggerFactory.getLogger(VehicleController.class);
	
	@RequestMapping(value = "/vehicleDetails", method = RequestMethod.GET)
	public String getAllVehicleDetails(Locale locale, Model model) {
		logger.info("retrieving details", locale);	
		model.addAttribute("vehiclelist",vdao.getAllVehicle());
		
		
		return "vehicleDetails";
	}
	
	@RequestMapping(value="/{vid}/edit",method=RequestMethod.GET)
	public String editVehicle(@PathVariable("vid")int vid, Model model,HttpSession session){
		logger.info("search by id");
		model.addAttribute("vehicle",vdao.getById(vid));
		return "editForm";
		
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updateVehicle(@ModelAttribute Vehicle v, Model model,HttpSession session){
		vdao.updateVehicle(v);
		model.addAttribute("vlist",vdao.getAllVehicle());
		
		return "search";
	}


}
