package com.rays.TestEmp;

import com.rays.bean.Employee;
import com.rays.model.EmployeeDaoImpl;

public class TestEmp {

	public static void main(String[] args) {
		testadd();

	}

	private static void testadd() {
		Employee emp=new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Dev");
		emp.setEmpemail("dev@gmail.com");
		emp.setEmpcontact("9301466730");
		emp.setEmpdesignation("it");
		emp.setEmpsal(23456);
		emp.setEmppass("dev@123");
		EmployeeDaoImpl model=new EmployeeDaoImpl();
		model.addEmployee(emp);
		
		
	}

}
