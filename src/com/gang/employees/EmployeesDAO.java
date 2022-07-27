package com.gang.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gang.regions.RegionsDTO;
import com.gang.util.DBConnector;

public class EmployeesDAO {
	
	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM EMPLOYEES";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.
		
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			EmployeesDTO employeesDTO = new EmployeesDTO();
			int id = rs.getInt("Employee_id");
			String f_name = rs.getString("First_name");
			String l_name = rs.getString("Last_name");
			String email = rs.getString("Email");
			String phone = rs.getString("Phone_number");
			String h_date = rs.getString("Hire_date");
			String job_id = rs.getString("Job_id");
			int salary = rs.getInt("Salary");
			long c_pct = rs.getLong("Commission_pct");
			int m_id = rs.getInt("Manager_id");
			int d_id = rs.getInt("Department_id");

			employeesDTO.setEmployee_ID(id);
			employeesDTO.setFirst_Name(f_name);
			employeesDTO.setLast_Name(l_name);
			employeesDTO.setEmail(email);
			employeesDTO.setPhone_Number(phone);
			employeesDTO.setHire_Date(h_date);
			employeesDTO.setJob_ID(job_id);
			employeesDTO.setSalary(salary);
			employeesDTO.setCommission_PCT(c_pct);
			employeesDTO.setManager_ID(m_id);
			employeesDTO.setDepartment_ID(d_id);
			
			ar.add(employeesDTO);
		}
		
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
	
	public EmployeesDTO getDetail(int employee_id) throws Exception {
		EmployeesDTO employeesDTO = new EmployeesDTO();
		//regionsDTO = null;

		//1. DB 연결
				Connection con = DBConnector.getConnection();
				
				//2. Query문 작성
				String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";
				
				//3. Query 문 미리 전송
				PreparedStatement st = con.prepareStatement(sql);
				
				//4. ? 값 세팅
				st.setInt(1, employee_id);
			
				
				//5. 최종 전송 후 결과를 처리
				ResultSet rs = st.executeQuery();
				
				if(rs.next()) {
					employeesDTO.setEmployee_ID(rs.getInt(1));
					employeesDTO.setFirst_Name(rs.getString(2));
					employeesDTO.setLast_Name(rs.getString(3));
					employeesDTO.setEmail(rs.getString(4));
					employeesDTO.setPhone_Number(rs.getString(5));
					employeesDTO.setHire_Date(rs.getString(6));
					employeesDTO.setJob_ID(rs.getString(7));
					employeesDTO.setSalary(rs.getInt(8));
					employeesDTO.setCommission_PCT(rs.getLong(9));
					employeesDTO.setManager_ID(rs.getInt(10));
					employeesDTO.setDepartment_ID(rs.getInt(11));

					System.out.println("=================");
				}
				DBConnector.disConnect(rs, st, con);
				return employeesDTO;

	}

}
