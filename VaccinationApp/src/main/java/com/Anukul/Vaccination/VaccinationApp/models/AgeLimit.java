package com.Anukul.Vaccination.VaccinationApp.models;

public enum AgeLimit {
	
	AGE0TO45(0,45),
	AGE18TO45(18,45),
	AGE45TO60(45,60),
	AGE0TOABOVE(0,Integer.MAX_VALUE),
	AGE60TOABOVE(60,Integer.MAX_VALUE),
	AGE18TOABOVE(18,Integer.MAX_VALUE),
	AGE45TOABOVE(45,Integer.MAX_VALUE);
	
	
	Integer minAge;
	Integer maxAge;
	
	private AgeLimit(Integer minAge, Integer maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}
		

}
