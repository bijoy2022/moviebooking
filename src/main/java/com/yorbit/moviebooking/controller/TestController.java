package com.yorbit.moviebooking.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	
	private static final Logger LOGGER = LogManager.getLogger(TestController.class);
	
	@GetMapping("/check")
	public String check() {
		LOGGER.info("TestController check method started");
		return "success";
	}

}
