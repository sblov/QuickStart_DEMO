package com.lov.controller.user;

import javax.json.Json;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lov.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/login")
	public String login(@RequestParam("username")String name,@RequestParam("password")String password) {
		
		String info = "login user : "+name;
		if (userService.login(name, password)) {
			return info+" SUCCESS";
		}
		
		
		return info+" FAILED";
	}
	
	
}
