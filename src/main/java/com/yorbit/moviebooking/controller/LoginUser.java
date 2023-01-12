package com.yorbit.moviebooking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public interface LoginUser {
	
	@PostMapping
	public String login();

}
