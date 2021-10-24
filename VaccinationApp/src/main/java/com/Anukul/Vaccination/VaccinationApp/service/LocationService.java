package com.Anukul.Vaccination.VaccinationApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anukul.Vaccination.VaccinationApp.Repositories.LocationRepository;
import com.Anukul.Vaccination.VaccinationApp.models.Location;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	public Location getLocationById(int locationId) {
		// TODO Auto-generated method stub
		return locationRepository.findById(locationId)
				.orElseThrow();
	}

}
