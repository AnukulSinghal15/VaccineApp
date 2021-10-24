package com.Anukul.Vaccination.VaccinationApp.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="slots")
public class Slot {
	
	@Id
	@GeneratedValue
	private Integer slotId;
	
	@NotNull
	@ManyToOne  //many slots in one location
	private Location location;
	
	@NotNull
	private Date date;
	
	@Enumerated(EnumType.STRING)
	private Vaccine vaccine;
	
	@Enumerated(EnumType.STRING)
	private AgeLimit ageLimit;
	
	@NotNull
	@Min(1)
	private Integer count;
	

}
