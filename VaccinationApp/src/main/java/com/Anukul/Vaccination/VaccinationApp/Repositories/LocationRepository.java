package com.Anukul.Vaccination.VaccinationApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anukul.Vaccination.VaccinationApp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
