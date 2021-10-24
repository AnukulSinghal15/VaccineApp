package com.Anukul.Vaccination.VaccinationApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anukul.Vaccination.VaccinationApp.Repositories.SlotRepository;
import com.Anukul.Vaccination.VaccinationApp.models.Slot;

@Service
public class SlotService {
	
	@Autowired
	private SlotRepository slotRepository;

	public Slot getSlotById(int slotId) {
		// TODO Auto-generated method stub
		return slotRepository.findById(slotId)
				.orElseThrow();
	}

}
