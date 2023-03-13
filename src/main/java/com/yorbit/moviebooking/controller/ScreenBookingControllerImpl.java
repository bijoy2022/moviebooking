package com.yorbit.moviebooking.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

import com.yorbit.moviebooking.models.Screen;
@RestController
public class ScreenBookingControllerImpl implements ScreenBookingController {
	private static final Logger LOGGER = LogManager.getLogger(ScreenBookingControllerImpl.class);
	@Override
	public Screen getScreen() {
		LOGGER.info("ScreenBookingControllerImpl check method started");
		return new Screen("Test Screen");
	}

}
