package com.Anukul.Vaccination.VaccinationApp.models;

public enum Vaccine {
	
	COVISHIELD("Covishield",750.0,2,56),
	COVAXIN("Covaxin",1200.0,2,28),
	SPUTNIK("Sputnik",1000.0,1,null);
	
	private String name;
	private Double cost;
	private Integer numberDoses;
	private Integer minDays;
	
	private Vaccine(String name, Double cost, Integer numberDoses, Integer minDays) {
		this.name = name;
		this.cost = cost;
		this.numberDoses = numberDoses;
		this.minDays = minDays;
	}

	public String getName() {
		return name;
	}

	public Double getCost() {
		return cost;
	}

	public Integer getNumberDoses() {
		return numberDoses;
	}

	public Integer getMinDays() {
		return minDays;
	}
		

}
