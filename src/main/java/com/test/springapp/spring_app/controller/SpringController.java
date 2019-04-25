package com.test.springapp.spring_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springapp.spring_app.entity.User;
import com.test.springapp.spring_app.service.UserService;

@Component
@RequestMapping(value = "/app")
public class SpringController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index")
	public String showIndex() {
		return "index";
	}

	@RequestMapping(value = "/get")
	public String getAllUserDetails(Model model, User user) {
		userService.saveUserDetails(user);
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("allUsers", allUsers);
		return "user";
	}

}
