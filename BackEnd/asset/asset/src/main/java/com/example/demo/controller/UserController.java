package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller

public class UserController {
	
	@Autowired private UserService  userService;
	
	@PostMapping("/login")
	public String login(Model model,@RequestParam String username,@RequestParam String password) {
		
		
		List<User> login= userService.login(username, password);
		User user = new User();
		for (User us: login) {
			user.setRole(us.getRole());
		}
		if(login.size()>0) {
			if (user.getRole().equals("Admin")) {
				return "redirect:/admin";
			}if(user.getRole().equals("Student")) {
				return "redirect:/student";
			}
		}
		return "student";
	}

}
