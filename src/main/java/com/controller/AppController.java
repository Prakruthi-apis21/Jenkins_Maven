package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;
//use RESTcontroller when methods in this class returns object directly

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public String loginValid(@RequestBody User user) {

		if (service.loginValidate(user)) {
			return "user is validated and success";
		}

		return "login error";
	}

	@PostMapping("/register")

	public String registerUser(@RequestBody User user) {

		service.addUser(user);

		return "register";
	}
	@GetMapping("/loadusers")
	public List<User> loadAll(){
		return service.loadAll();
	}
	@GetMapping("/finduser/{uname}")
	public String findUser(@PathVariable String uname) {
		
		if(service.findUser(uname)) {
			return uname + "found ";
		}
		return "User is not found";
		
	}
	
	@DeleteMapping("/deleteuser/{uname}")
	public String deleteUser(@PathVariable String uname) {
		
		if(service.deleteUser(uname)) {
			return uname + "found and deleted";
		}
		return "User is not found";
		
	}
	@PutMapping("/updateuser/{uname}")
	public String updateUser(@PathVariable String uname, @ModelAttribute User user) {
		
		
		return null;
	}
	
}
