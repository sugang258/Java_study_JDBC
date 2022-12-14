package com.gang.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.gang.util.DBConnector;

public class RegionsDAO {
	
	public int setRegion(RegionsDTO regionsDTO) throws Exception{
		
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "INSERT INTO REGIONS VALUES(?,?)";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setInt(1, regionsDTO.getRegion_id());
		st.setString(2, regionsDTO.getRegion_name());
	
		
		//5. 최종 전송 후 결과를 처리
		int result = st.executeUpdate();
		
		//6. 자원해제
		DBConnector.disConnect( st, con);
		
		return result;
		
	}
	//2. Regions에서 하나의 결과(row)
	public RegionsDTO getDetail(int region_id) throws Exception {
		RegionsDTO regionsDTO = new RegionsDTO();
		//regionsDTO = null;
		
		

		//1. DB 연결
				Connection con = DBConnector.getConnection();
				
				//2. Query문 작성
				String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";
				
				//3. Query 문 미리 전송
				PreparedStatement st = con.prepareStatement(sql);
				
				//4. ? 값 세팅
				st.setInt(1, region_id);
			
				
				//5. 최종 전송 후 결과를 처리
				ResultSet rs = st.executeQuery();
				int rId;
				String rName;
				
				if(rs.next()) {
					 rId = rs.getInt(1);
					 rName = rs.getString(2);
					 regionsDTO.setRegion_id(rId);
					 regionsDTO.setRegion_name(rName);
					
					System.out.println("=================");
				}
				DBConnector.disConnect(rs, st, con);
				return regionsDTO;

	}
	
	//1. Regions 의 모든 데이터 가져오기
	public ArrayList<RegionsDTO> getList() throws Exception {
		ArrayList<RegionsDTO> ar = new ArrayList();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.
		
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			RegionsDTO regionsDTO = new RegionsDTO();
			int id = rs.getInt("Region_id");
			String name = rs.getString("Region_name");
			regionsDTO.setRegion_id(id);
			regionsDTO.setRegion_name(name);
			ar.add(regionsDTO);
		}
		
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
}


