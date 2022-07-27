package com.gang.test;

import java.util.ArrayList;

import com.gang.countries.CountriesDAO;
import com.gang.countries.CountriesDTO;
import com.gang.countries.CountriesView;
import com.gang.regions.RegionsDAO;
import com.gang.regions.RegionsDTO;
import com.gang.regions.RegionsView;
import com.gang.util.DBConnector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		CountriesView countriesView = new CountriesView();
		ArrayList<RegionsDTO> ar = regionsDAO.getList();
		System.out.println("==============");
		ArrayList<CountriesDTO> ar2 = countriesDAO.getList();
		RegionsDTO regionsDTO = regionsDAO.getDetail(1);
		regionsView.view(regionsDTO);
		CountriesDTO countriesDTO = countriesDAO.getDetail("AU");
		countriesView.view(countriesDTO);
		regionsView.view(ar);
		countriesView.view(ar2);
		
		
		

	}

}
