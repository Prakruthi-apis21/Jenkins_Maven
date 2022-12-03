package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//use controller when methods in this class returns resources
@Controller
@RequestMapping("/mainapp")
public class ResController {
	
	
	 
    @GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)

	public String register() {
		return "register";

	}


}
