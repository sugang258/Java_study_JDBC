package com.gang.countries;

import java.util.ArrayList;

public class CountriesView {
	public void view(CountriesDTO countriesDTO) {
		
		String c_id = countriesDTO.getCountry_ID();
		String c_name = countriesDTO.getCountry_Name();
		int r_id = countriesDTO.getRegions_ID();
		
		System.out.println(c_id);
		System.out.println(c_name);
		System.out.println(r_id);
		System.out.println("==================");
		
	}
	
	public void view(ArrayList<CountriesDTO> ar) {
		
		for(CountriesDTO countriesDTO : ar) {
			String c_id = countriesDTO.getCountry_ID();
			String c_name = countriesDTO.getCountry_Name();
			int r_id = countriesDTO.getRegions_ID();
			System.out.println(c_id);
			System.out.println(c_name);
			System.out.println(r_id);
			System.out.println("===================");
		}
	}

}
