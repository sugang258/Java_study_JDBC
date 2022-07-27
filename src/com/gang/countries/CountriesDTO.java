package com.gang.countries;

public class CountriesDTO {
	private String country_ID;
	private String country_Name;
	private Integer regions_ID;
	
	public CountriesDTO() {
		this.getCountry_ID();
		this.getCountry_Name();
		this.getRegions_ID();
	}
	
	public String getCountry_ID() {
		return country_ID;
	}
	public void setCountry_ID(String country_ID) {
		this.country_ID = country_ID;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public Integer getRegions_ID() {
		return regions_ID;
	}
	public void setRegions_ID(Integer regions_ID) {
		this.regions_ID = regions_ID;
	}

}
