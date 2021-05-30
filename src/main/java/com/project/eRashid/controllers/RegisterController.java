package com.project.eRashid.controllers;



import javax.servlet.http.HttpSession;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.project.eRashid.daos.RegisterDao;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.Vehicle;




@Controller
public class RegisterController {
	
	@Autowired
	private RegisterDao rdao;
	
	
	
	
	private static final Logger Logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value="/registervehicle",method=RequestMethod.GET)
	public String getRegistrationForm(Model model, HttpSession session){
		model.addAttribute("vehicle", new  Vehicle());
		return "selectVehicletype";
		
	}
	@RequestMapping(value="/registervehicle", method=RequestMethod.POST)
	public String saveVehicleDetail(@ModelAttribute VehicleDto v, HttpSession session){
		
		Logger.info("into controller");
		rdao.registerVehicleInfo(v);
	
		
		//infoBox("Registered Vehicle Successfully", "Vehicle Registration");
		
		//model.addAttribute("slist",sdao.getAllStudent());
		
		
		return "adminpage";
	}
	@RequestMapping(value="/registerVehicle",method=RequestMethod.GET)
	public String getTwoWheelerForm(Model model, HttpSession session){
		model.addAttribute("vehicle", new  Vehicle());
		return "twoWheeler";
	
	}
	
	@RequestMapping(value="/registerByVehicletype",method=RequestMethod.GET)
	public String getRegisterVehicleType(Model model, HttpSession session){
		model.addAttribute("vehicle", new  Vehicle());
		
		return "selectVehicletype";
	
	}
	@RequestMapping(value="/registerTwoWheeler",method=RequestMethod.GET)
		public String registerVehicleType(Model model, HttpSession session){
		Logger.info("into two wheeler");
		model.addAttribute("vehicle", new  Vehicle());
		return "twoWheeler";
	
	}
}
