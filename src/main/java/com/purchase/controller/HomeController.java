package com.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Users;
import com.purchase.sevice.UsersService;


@RestController
public class HomeController {
	@Autowired
	private UsersService userService;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/users")
	public List<Users> getUsers() {
		return userService.getAllUsers();
	}

}
