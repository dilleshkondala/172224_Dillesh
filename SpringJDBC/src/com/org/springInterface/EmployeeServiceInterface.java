package com.org.springInterface;

import java.util.List;

import com.org.springpojo.Employee;

public interface EmployeeServiceInterface {
	
	public boolean addEmp(Employee emp);
	public List<Employee> getEmp(Employee emp);
	public boolean updateEmpSal(Employee emp);
	public List<Employee> getMaxSal();
	
	
	
}
