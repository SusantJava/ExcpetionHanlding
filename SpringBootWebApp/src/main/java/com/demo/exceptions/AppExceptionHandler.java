package com.demo.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value= NullPointerException.class)
	public String handleNullPointerExcpetion(Model model) {
		
		model.addAttribute("errMsg","Some problem occured,Please try agin later");
		return "Error";
	}

}
