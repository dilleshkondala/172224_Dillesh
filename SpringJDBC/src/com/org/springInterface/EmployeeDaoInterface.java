package com.org.springInterface;

import java.util.List;

import com.org.springpojo.Employee;

public interface EmployeeDaoInterface {
	
	public List<Employee> getAll();
	public boolean insert(Employee emp);
	public boolean delete(Employee emp);
	public boolean update(Employee emp);
	public List<Employee> groupBy();
	public List<Employee> orderBy();
	
	
	
}
