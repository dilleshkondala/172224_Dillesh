package com.org.EmployeeServices;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.implementation.EmployeeDaoImpl;
import com.org.springInterface.EmployeeDaoInterface;
import com.org.springInterface.EmployeeServiceInterface;
import com.org.springpojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee emp = new Employee();
		
		emp.setDeptId(11);
//		emp.setEmpId(107);
//		emp.setEmpName("renuka");
		emp.setEmpSal(75000);
//		emp.setComm(850);
//		emp.setJob("Analyast");
//		emp.setMgr("Mgr1");
//		emp.setHireDate("06-03-2019");

		EmployeeDaoInterface e=(EmployeeDaoInterface)context.getBean("empdao");
	    
        //empseervice.getMaxSal();						
        //empdao.insert(emp);
        //empdao.delete(emp);
        //empdao.update(emp);
        
		List<Employee> listorder=  e.getAll();
		for(Employee e1 : listorder) {System.out.println(e1);}
		
//		List<Employee> listgroup= empdao.groupBy();
//		for(Employee e : listgroup) { System.out.println(e); }
//		 
	}


}
