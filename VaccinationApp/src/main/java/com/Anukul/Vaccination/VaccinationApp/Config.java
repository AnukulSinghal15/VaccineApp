package com.Anukul.Vaccination.VaccinationApp;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Anukul.Vaccination.VaccinationApp.Repositories.LocationRepository;
import com.Anukul.Vaccination.VaccinationApp.Repositories.SlotRepository;
import com.Anukul.Vaccination.VaccinationApp.models.AgeLimit;
import com.Anukul.Vaccination.VaccinationApp.models.Agency;
import com.Anukul.Vaccination.VaccinationApp.models.Location;
import com.Anukul.Vaccination.VaccinationApp.models.Slot;
import com.Anukul.Vaccination.VaccinationApp.models.Vaccine;

@Configuration
public class Config {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private SlotRepository slotRepository;
		
	@Bean
	CommandLineRunner commandLineRunner() {
		return args ->{
			Location locationObj1= new Location();
			locationObj1.setName("APJ School");
			locationObj1.setAddress("Pitampura,Delhi");
			locationObj1.setAgency(Agency.PRIVATE);
			locationObj1.setPincode(110034);
			
			Location locationObj2= new Location();
			locationObj2.setName("AIIMS");
			locationObj2.setAddress("Something,Delhi");
			locationObj2.setAgency(Agency.GOVERNMENT);
			locationObj2.setPincode(110428);
			
			locationRepository.save(locationObj1);
			locationRepository.save(locationObj2);
			
			Slot slotObj1= new Slot();
			slotObj1.setVaccine(Vaccine.COVISHIELD);
			slotObj1.setLocation(locationRepository.getById(1));
			slotObj1.setAgeLimit(AgeLimit.AGE0TOABOVE);
			slotObj1.setDate(Date.valueOf("2021-10-24"));
			slotObj1.setCount(45);
			
			Slot slotObj2= new Slot();
			slotObj2.setVaccine(Vaccine.SPUTNIK);
			slotObj2.setLocation(locationRepository.getById(2));
			slotObj2.setAgeLimit(AgeLimit.AGE18TO45);
			slotObj2.setDate(Date.valueOf("2021-10-24"));
			slotObj2.setCount(38);
			
			slotRepository.save(slotObj1);
			slotRepository.save(slotObj2);
		};
	}
}
