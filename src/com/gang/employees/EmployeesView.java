package com.gang.employees;

import java.util.ArrayList;

public class EmployeesView {
	
	public void view(EmployeesDTO employeesDTO) {
		
		System.out.println(employeesDTO.getEmployee_ID());
		System.out.println(employeesDTO.getFirst_Name());
		System.out.println(employeesDTO.getLast_Name());
		System.out.println(employeesDTO.getEmail());
		System.out.println(employeesDTO.getPhone_Number());
		System.out.println(employeesDTO.getHire_Date());
		System.out.println(employeesDTO.getJob_ID());
		System.out.println(employeesDTO.getSalary());
		System.out.println(employeesDTO.getCommission_PCT());
		System.out.println(employeesDTO.getManager_ID());
		System.out.println(employeesDTO.getDepartment_ID());


	}
	
	public void view(ArrayList<EmployeesDTO> ar) {
		
		for(EmployeesDTO employeesDTO : ar) {
			System.out.println(employeesDTO.getEmployee_ID());
			System.out.println(employeesDTO.getFirst_Name());
			System.out.println(employeesDTO.getLast_Name());
			System.out.println(employeesDTO.getEmail());
			System.out.println(employeesDTO.getPhone_Number());
			System.out.println(employeesDTO.getHire_Date());
			System.out.println(employeesDTO.getJob_ID());
			System.out.println(employeesDTO.getSalary());
			System.out.println(employeesDTO.getCommission_PCT());
			System.out.println(employeesDTO.getManager_ID());
			System.out.println(employeesDTO.getDepartment_ID());
			System.out.println("================================");
		}
		
	}

}
