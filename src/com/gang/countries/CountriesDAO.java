package com.gang.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.gang.util.DBConnector;

public class CountriesDAO {
	
	//setCountry
	public int setCountry(CountriesDTO countriesDTO) throws Exception{
		//1. DB 연결
				Connection con = DBConnector.getConnection();
				
				//2. Query문 작성
				String sql = "INSERT INTO COUNTRIES VALUES(?,?,?)";
				
				//3. Query 문 미리 전송
				PreparedStatement st = con.prepareStatement(sql);
				
				//4. ? 값 세팅
				st.setString(1, countriesDTO.getCountry_ID());
				st.setString(2, countriesDTO.getCountry_Name());
				st.setInt(3, countriesDTO.getRegions_ID());
			
				
				//5. 최종 전송 후 결과를 처리
				int result = st.executeUpdate();
				
				//6. 자원해제
				DBConnector.disConnect( st, con);
				
				return result;
	}
	
	public CountriesDTO getDetail(String search) throws Exception {
		CountriesDTO countriesDTO = new CountriesDTO();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		String sql2 = "SELECT * FROM COUNTRIES WHERE COUNTRY_NAME LIKE '%'a'%'";
		String sql3 = "SELECT * FROM COUNTRIES WHERE COUNTRY_NAME LIKE '%'||?||'%'";

		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		//st.setString(1, country_id);
		st.setString(1, "%"+search+"%");
	
		
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
