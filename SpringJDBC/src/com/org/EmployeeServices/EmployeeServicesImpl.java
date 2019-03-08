package com.org.EmployeeServices;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.implementation.EmployeeDaoImpl;
import com.org.springInterface.EmployeeServiceInterface;
import com.org.springpojo.Employee;

public class EmployeeServicesImpl implements EmployeeServiceInterface {

	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	EmployeeDaoImpl empdao = (EmployeeDaoImpl)context.getBean("empdao");
	
	
	@Override
	public boolean addEmp(Employee emp) {
		
		empdao.insert(emp);
		return true;
		
	}

	@Override
	public List<Employee> getEmp(Employee emp) {
		
		return null;
	}

	@Override
	public boolean updateEmpSal(Employee emp) {
		
		empdao.update(emp);
		return true;
		
	}

	@Override
	public List<Employee> getMaxSal() {
		List<Employee> list=empdao.getAll();
		Double maxSal=list.stream().map(e -> e.getEmpSal()).max((x,y) -> x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

		
	
	

}
