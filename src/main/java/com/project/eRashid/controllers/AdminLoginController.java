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

import com.project.eRashid.daos.AdminLoginDao;
import com.project.eRashid.dtos.OwnershipTransferDto;
import com.project.eRashid.dtos.VehicleDto;
import com.project.eRashid.models.Admin;

@Controller
public class AdminLoginController {

	@Autowired(required = true)
	private AdminLoginDao adao;

	private static final Logger logger = LoggerFactory.getLogger(AdminLoginController.class);

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String getLoginPage() {
		logger.info("inside login page method");
		return "adminlogin";

	}

	@RequestMapping(value = "/adminpage", method = RequestMethod.POST)
	public String AdminLogin(@ModelAttribute Admin a, Model model, HttpSession session) {
		// controller bta jsp ma value pathauda model use grne
		logger.info(a.getUsername(), a.getPassword());
		if (adao.AdminLogin(a.getUsername(), a.getPassword())) {
			logger.info(String.valueOf(a));
			session.setAttribute("activeUser", a.getUsername());
			session.setMaxInactiveInterval(5 * 60);

			model.addAttribute("a_username", a.getUsername());
			model.addAttribute("vehicle", new VehicleDto());
			logger.info("login successful");

			return "adminpage";

		}
		logger.info("login failed");
		model.addAttribute("error", "user doesnot exist"); // key, value
		return "login";

	}

	@RequestMapping("/adminhomepage")
	String ownwerTransfer(Model model) {
		logger.info("admin page");

		return "adminpage";
	}

}
