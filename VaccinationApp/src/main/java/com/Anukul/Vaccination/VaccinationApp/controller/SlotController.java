package com.Anukul.Vaccination.VaccinationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Anukul.Vaccination.VaccinationApp.models.Slot;
import com.Anukul.Vaccination.VaccinationApp.service.SlotService;

@RestController
@RequestMapping("/slot")
public class SlotController {
	
	@Autowired
	private SlotService slotService;
	
	@GetMapping("/{slotId}")
	public Slot getSlotById(@PathVariable int slotId) {
		return slotService.getSlotById(slotId);
	}


}
