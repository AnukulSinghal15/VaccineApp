package com.Anukul.Vaccination.VaccinationApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anukul.Vaccination.VaccinationApp.models.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer>{

}
