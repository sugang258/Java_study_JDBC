package com.gang.regions;

import java.util.ArrayList;

public class RegionsView {
	//RegionsDTO rdto = new RegionsDTO();
	//RegionsDAO rdao = new RegionsDAO();
	//view
	public void view(RegionsDTO regionsDTO) throws Exception {
		
		//rdao.getDetail(1);
		
		int id = regionsDTO.getRegion_id();
		String name = regionsDTO.getRegion_name();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println("================");
		
	}
	
	public void view(ArrayList<RegionsDTO> ar) {
	
		
		for(RegionsDTO regionsDTO :ar) {
			
			int id = regionsDTO.getRegion_id();
			String name = regionsDTO.getRegion_name();
			System.out.println(id);
			System.out.println(name);
			System.out.println("================");
		}
		
	}

}
