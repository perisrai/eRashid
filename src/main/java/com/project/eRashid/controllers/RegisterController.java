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

import com.project.eRashid.AlertMessage;
import com.project.eRashid.daos.RegisterDao;

import com.project.eRashid.models.Vehicle;




@Controller
public class RegisterController extends AlertMessage{
	
	@Autowired
	private RegisterDao rdao;
	
	private static final Logger Logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value="/registervehicle",method=RequestMethod.GET)
	public String getRegistrationForm(Model model, HttpSession session){
		model.addAttribute("vehicle", new  Vehicle());
		return "registrationform";
		
	}
	@RequestMapping(value="/registervehicle", method=RequestMethod.POST)
	public String saveVehicleDetail(@ModelAttribute Vehicle v, HttpSession session){
		
		Logger.info("into controller");
		rdao.registerVehicleInfo(v);
	
		
		infoBox("Registered Vehicle Successfully", "Vehicle Registration");
		
		//model.addAttribute("slist",sdao.getAllStudent());
		
		
		return "home";
	}
	
}
