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
import org.springframework.web.servlet.ModelAndView;

import com.project.eRashid.daos.OwnerDao;
import com.project.eRashid.dtos.OwnerLogin;
import com.project.eRashid.models.Vehicle;

@Controller
public class OwnerDetailsController {

	@Autowired
	private OwnerDao adao;

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping(value = "/ownerlogin", method = RequestMethod.GET)
	public String getLoginPage() {
		return "ownerLogin";

	}

	@RequestMapping(value = "/ownerPage", method = RequestMethod.POST)
	public Object AdminLogin(@ModelAttribute OwnerLogin a, Model model,
			HttpSession session) {
		logger.info("received");
		// controller bta jsp ma value pathauda model use grne
		if (adao.login(a.getVno(), a.getPassword())) {
			session.setAttribute("activeVehicle", a.getVno());
			session.setMaxInactiveInterval(5 * 60);
			Vehicle vechicle = adao.getVehicle(a.getVno());
			model.addAttribute("vehicle", vechicle);
			model.addAttribute("tax", adao.getTaxDetails(a.getVno()));
			return new ModelAndView("ownerPage");
		}
		else {
			logger.info("Not matched");
			model.addAttribute("error", "user doesnot exist"); 
		}
		// key, value
		return "ownerLogin";
	}

}
