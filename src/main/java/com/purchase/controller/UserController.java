package com.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Users;
import com.purchase.sevice.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersService userService;

	@GetMapping("/all")
	public List<Users> getAll() {
		return userService.getAllUsers();
	}

	@GetMapping("/{uid}")
	public Users getUserById(@PathVariable(name = "uid") String username) {
		return userService.getUserById(username);
	}

	@PostMapping("/add")
	public boolean addUser(Users user) {
		return userService.insertUser(user);
	}

	@PostMapping("/delete")
	public boolean deleteUser(@RequestParam(value = "uid") String username) {
		return userService.deleteUser(username);
	}

	@PostMapping("update")
	public boolean updateUser(Users user) {
		return userService.updateUser(user);
	}

}
