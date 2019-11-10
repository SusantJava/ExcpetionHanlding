package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg","Welcome to Ashok IT School");
		
		String name=null;
		name.length();
		
		return "welcome";
	}
	/*
	 * Controller Based Exception Handler logic
	 * @Author Susant
	 */
	@ExceptionHandler(value= NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errMsg", "Some problem occured, please try again later");
		return "Error";
	}

}
