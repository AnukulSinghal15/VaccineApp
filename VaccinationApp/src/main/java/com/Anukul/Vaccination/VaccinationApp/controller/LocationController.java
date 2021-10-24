package com.Anukul.Vaccination.VaccinationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Anukul.Vaccination.VaccinationApp.models.Location;
import com.Anukul.Vaccination.VaccinationApp.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/{locationId}")
	public Location getLocationById(@PathVariable int locationId) {
		return locationService.getLocationById(locationId);
	}

}
