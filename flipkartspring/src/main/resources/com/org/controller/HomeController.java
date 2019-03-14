package com.org.controller;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.User;

@Controller

public class HomeController {
	
	@RequestMapping("/a")
	public ModelAndView display() {
		ModelAndView modelAndView = new ModelAndView("views/index");
		modelAndView.addObject("","Hello world")		
		return modelAndView;
	}
	
}