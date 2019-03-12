package com.dillesh.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dillesh.UserPojoServices.User;


@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getData() {

		ModelAndView model = new ModelAndView("index");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin() {

		ModelAndView model = new ModelAndView("login");

		return model;

	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView getLogin(@RequestParam(value="mobilenum") String mobilenum, 
//			@RequestParam(value="password") String password,
//			@RequestParam(value="firstName") String firstName) {
//		
//		ModelAndView model = new ModelAndView("login");
//		model.addObject("firstName", firstName);
//		
//		return model;
//
//	}
//	
//	
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	public ModelAndView getRegister() {
//		String registerSuccess = null;
//		ModelAndView model = new ModelAndView("register");
//		model.addObject("Regestration Successfully Completed", registerSuccess);
//		return model;
//
//	}
//	
//	
//	@RequestMapping(value = "/validateUser", method = RequestMethod.GET)
//	public ModelAndView getValidate() {
//		UserServicesImpl userService = null;
//		User status = userService.validateUser()
//		ModelAndView model = new ModelAndView("register");
//		model.addObject("Regestration Successfully Completed", registerSuccess);
//		return model;
//	}
}
