package com.Anukul.Vaccination.VaccinationApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "locations")
public class Location {

	@Id
	@GeneratedValue
	private Integer locationId;
	
	//@Column(nullable=false)
	@NotNull //hibernate validator in "validations" dependency
	private String name;
	
	@NotNull
	private String address;
	
	@NotNull
	@Min(000000)
	@Max(999999)   //We want pincode to be max six digits
	private Integer pincode; 
	
	@Enumerated(EnumType.STRING)
	private Agency agency;
	
	public Location() {
		
	}

	public Location(Integer locationId, String name, String address, Integer pincode, Agency agency) {
		super();
		this.locationId = locationId;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.agency = agency;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + ", address=" + address + ", pincode=" + pincode
				+ ", agency=" + agency + "]";
	}
	
}
