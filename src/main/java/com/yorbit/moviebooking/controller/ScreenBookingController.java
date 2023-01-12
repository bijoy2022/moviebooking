package com.yorbit.moviebooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yorbit.moviebooking.models.Screen;


@RequestMapping("/Screen")
public interface ScreenBookingController {

	@GetMapping("/getScreen")
	public Screen getScreen();
	
}
