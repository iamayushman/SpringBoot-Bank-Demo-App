package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("users")
	public List<User> getUsers() {
		return userService.findAll();
	}

	@PostMapping("user")
	public User createUser(@Valid @RequestBody User user) {
		return userService.save(user);
	}
}
