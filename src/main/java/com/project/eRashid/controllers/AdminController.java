package com.project.eRashid.controllers;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.models.Vehicle;

@Controller
public class AdminController {
	@Autowired
	private VehicleDao vdao;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchVehicle(@RequestParam String vno,Locale locale, Model model,@ModelAttribute Vehicle v) {
		logger.info("searching the directory", locale);	
		model.addAttribute("vehicle", new Vehicle());
		
		model.addAttribute("vno",v.getVno());
		model.addAttribute("vmodel",v.getVmodel());

		model.addAttribute("results",vdao.searchVehicle(vno));
		
		
		return "search";
	}

	@RequestMapping(value="/vehicledetail", method=RequestMethod.POST)
	public String displaySearchedVehicle(Model model) {
		return null;
		
	}
	
	
}
