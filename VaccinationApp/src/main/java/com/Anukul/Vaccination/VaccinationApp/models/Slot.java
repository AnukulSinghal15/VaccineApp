package com.Anukul.Vaccination.VaccinationApp.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	
	@JoinColumn(name="location_id")  //just give a specific name to the column. If we remove this annotation, then it will be location_location_id
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
	
	
	public Slot() {
		
	}
	
	public Slot(Integer slotId, @NotNull Location location, @NotNull Date date, Vaccine vaccine, AgeLimit ageLimit,
			@NotNull @Min(1) Integer count) {
		this.slotId = slotId;
		this.location = location;
		this.date = date;
		this.vaccine = vaccine;
		this.ageLimit = ageLimit;
		this.count = count;
	}


	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public AgeLimit getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(AgeLimit ageLimit) {
		this.ageLimit = ageLimit;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Slot [slotId=" + slotId + ", location=" + location + ", date=" + date + ", vaccine=" + vaccine
				+ ", ageLimit=" + ageLimit + ", count=" + count + "]";
	}
	
	
	
	
}
