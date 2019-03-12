//package com.dillesh.web.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.dillesh.UserPojoServices.User;
//import com.org.implementation.UserServicesImpl;
//
//public class RegisterController {
//	
//	 @Autowired
//	 public UserServicesImpl userService;
//	 
//	  @RequestMapping(value = "/register", method = RequestMethod.GET)
//	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
//	    ModelAndView model = new ModelAndView("register");
//	   // model.addObject("user", new User());
//	    return model;
//	  }
//	  
//	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
//	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
//	  @ModelAttribute("user") User user) {
//		  userService.addUser(user);
//		  return new ModelAndView("welcome", "firstname", user.getFirstName());
//	  }
//	}
//
