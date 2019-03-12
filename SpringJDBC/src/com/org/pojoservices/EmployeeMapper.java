package com.org.pojoservices;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class EmployeeMapper implements org.springframework.jdbc.core.RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int empId) throws SQLException {
		
	        Employee emp = new Employee();
	        
	        emp.setDeptId(rs.getInt("deptid"));
	        emp.setEmpId(rs.getInt("empid"));
	        emp.setEmpName(rs.getString("ename"));
	        emp.setEmpSal(rs.getInt("sal"));
	        emp.setComm(rs.getInt("comm"));
	        emp.setJob(rs.getString("job"));
	        emp.setMgr(rs.getString("mgr"));
	        emp.setHireDate(rs.getString("hiredate"));
	        return emp;
	}

}







