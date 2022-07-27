package com.gang.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.gang.util.DBConnector;

public class CountriesDAO {
	
	public CountriesDTO getDetail(String country_id) throws Exception {
		CountriesDTO countriesDTO = new CountriesDTO();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setString(1, country_id);
	
		
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("Country_id");
			String name = rs.getString("Country_name");
			int r_id = rs.getInt("Region_id");
			countriesDTO.setCountry_ID(id);
			countriesDTO.setCountry_Name(name);
			countriesDTO.setRegions_ID(r_id);
			
		}
		DBConnector.disConnect(rs, st, con);

		return countriesDTO;
		
	}
	
	
	
	public ArrayList<CountriesDTO> getList() throws Exception {
		ArrayList<CountriesDTO> ar = new ArrayList(); 
		//1. DB 연결
				Connection con = DBConnector.getConnection();
				
				//2. Query문 작성
				String sql = "SELECT * FROM COUNTRIES";
				
				//3. Query 문 미리 전송
				PreparedStatement st = con.prepareStatement(sql);
				
				//4.
				
				//5. 최종 전송 후 결과를 처리
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
					CountriesDTO countriesDTO = new CountriesDTO();
					String id = rs.getString("Country_id");
					String name = rs.getString("Country_name");
					int r_id = rs.getInt("Region_id");
					countriesDTO.setCountry_ID(id);
					countriesDTO.setCountry_Name(name);
					countriesDTO.setRegions_ID(r_id);
					ar.add(countriesDTO);
					
	}
				DBConnector.disConnect(rs, st, con);
				return ar;


}}
