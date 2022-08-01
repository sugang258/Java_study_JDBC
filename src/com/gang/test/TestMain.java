package com.gang.test;

import java.util.ArrayList;

import com.gang.countries.CountriesDAO;
import com.gang.countries.CountriesDTO;
import com.gang.countries.CountriesView;
import com.gang.employees.EmployeesDAO;
import com.gang.employees.EmployeesDTO;
import com.gang.employees.EmployeesView;
import com.gang.regions.RegionsDAO;
import com.gang.regions.RegionsDTO;
import com.gang.regions.RegionsView;
import com.gang.util.DBConnector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView employeesView = new EmployeesView();
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		CountriesView countriesView = new CountriesView();
		
		ArrayList<RegionsDTO> ar = regionsDAO.getList();
		//System.out.println("==============");
		//ArrayList<CountriesDTO> ar2 = countriesDAO.getList();
		//RegionsDTO regionsDTO = regionsDAO.getDetail(1);
		//RegionsDTO regionsDTO = new RegionsDTO();
		//regionsView.view(regionsDTO);
		//CountriesDTO countriesDTO = countriesDAO.getDetail("AU");
		//countriesView.view(countriesDTO);
		regionsView.view(ar);
		//countriesView.view(ar2);
		
		//EmployeesDTO employeesDTO = employeesDAO.getDetail(137);
		//employeesView.view(employeesDTO);
		//ArrayList<EmployeesDTO> ar3 = employeesDAO.getList();
		//employeesView.view(ar3);
		/*
		RegionsDTO regionsDTO = new RegionsDTO();
		regionsDTO.setRegion_id(6);
		regionsDTO.setRegion_name("Mars");
		int result = regionsDAO.setRegion(regionsDTO);
		
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		*/
		
		CountriesDTO countriesDTO = new CountriesDTO();
		countriesDTO.setCountry_ID("YA");
		countriesDTO.setCountry_Name("ZIPZUOHAE");
		countriesDTO.setRegions_ID(7);
		int result2 = countriesDAO.setCountry(countriesDTO);
		
		if (result2 > 0) {
			System.out.println("성공");
			
		}else {
			System.out.println("실패");
		}
		
		
		
		
		

	}

}