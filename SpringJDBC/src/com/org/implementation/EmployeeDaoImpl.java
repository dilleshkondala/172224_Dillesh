package com.org.implementation;

import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.org.springInterface.EmployeeDaoInterface;
import com.org.springpojo.Employee;
import com.org.springpojo.EmployeeMapper;

public class EmployeeDaoImpl implements EmployeeDaoInterface{
	
	private JdbcOperations jdbcTemplate;
	public void setJdbcTemplate(JdbcOperations jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	@Override
	public List<Employee> getAll() {
		 String sql="select * from emp";
		 return this.jdbcTemplate.query(sql, new EmployeeMapper());
		
		
	}

	@Override
	public boolean insert(Employee emp) {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		              
		        ps.setInt(1,emp.getDeptId());
		        ps.setInt(2,emp.getEmpId());
		        ps.setString(3,emp.getEmpName());  
		        ps.setDouble(4,emp.getEmpSal());  
		        ps.setInt(5, emp.getComm());
		        ps.setString(6,emp.getJob());
		        ps.setString(7,emp.getMgr());
		        ps.setString(8, emp.getHireDate());
		        return ps.execute();  
		    }          
		    });
			
	}

	@Override
	public boolean delete(Employee emp) {
			String SQL = "delete from emp where empid = "+emp.getEmpId();
			this.jdbcTemplate.update(SQL);
			System.out.println("Deleted Record with ID = " + emp.getEmpId());
			return true;
	}

	@Override
	public boolean update(Employee emp) {
		String updateQuery = "update emp set sal = ? where empid = ?";
		this.jdbcTemplate.update(updateQuery, emp.getEmpSal(), emp.getEmpId());
		return true;
		
		
	}

	public List<Employee> employee(Employee emp) {
		
		String sql = "select * from emp";
		return this.jdbcTemplate.query(sql, new EmployeeMapper());
		
	}

	@Override
	public List<Employee> orderBy() {
		String orderbyQuery = "select * from emp orderby deptid";
		return this.jdbcTemplate.query(orderbyQuery, new EmployeeMapper());
	}



	@Override
	public List<Employee> groupBy() {
		// TODO Auto-generated method stub
		return null;
	}

}
