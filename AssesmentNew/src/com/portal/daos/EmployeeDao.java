package com.portal.daos;

import java.util.ArrayList;
import java.util.List;

import com.portal.entities.Employee;

public interface EmployeeDao {
	
	public boolean register(Employee emp);
	public Employee validate(int empid,String password);
	public Employee getEmployeeById(int empid);
	public boolean updateEmployee(Employee emp,int i);
	public boolean changePass(String password,String p);
	public boolean deleteEmployee(int empid);
	public ArrayList<Employee> getAllEmployee();
}