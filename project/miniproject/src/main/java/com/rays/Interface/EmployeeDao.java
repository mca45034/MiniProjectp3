package com.rays.Interface;

import java.util.List;

import com.rays.bean.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee emp);
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int empid);
	public List<Employee> showEmpList();
	public Employee showEmployeeById(int empid);
	public Employee showEmployeeByEmail(String emailid);

}