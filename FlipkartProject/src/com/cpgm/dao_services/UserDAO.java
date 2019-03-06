package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cpgm.connectionservice.ConnectionFactory;
import com.cpgm.userpojoservices.User;

public class UserDAO {
	ConnectionFactory connectionFactiory;

	public User insert(User user) {

		try {
			Connection conn = ConnectionFactory.getConnection();
			String query = "insert into userdata values(?,?,?,?,?)";
			PreparedStatement pStatemnent = conn.prepareStatement(query);
			pStatemnent.setString(1, user.getFirstName());
			pStatemnent.setString(2, user.getLastname());
			pStatemnent.setString(3, user.getUserEmail());
			pStatemnent.setString(4, user.getUserMobile());
			pStatemnent.setString(5, user.getPassword());
			pStatemnent.executeQuery();
			

		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return user;

	}
	
	public User read(User user) throws ClassNotFoundException, SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		String query = "select * from userdata";
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, "firstname");
		pStatement.setString(2, "lastname");
		pStatement.setString(3, "email");
		pStatement.setString(4, "mobilenum");
		pStatement.setString(5, "password");
		ResultSet rs = pStatement.executeQuery();
		while(rs.next())
		{
		
		}
		
		return user;
		
	}
	
	public boolean validate(String mobilenum, String password) throws ClassNotFoundException, SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		
		String query = "select mobilenumber,password from userdata";
		PreparedStatement pStatement = conn.prepareStatement(query);
		
		ResultSet rs = pStatement.executeQuery();
		while(rs.next())
		{
			String dbmobilenum = rs.getString("mobilenumber");
			String dbpassword =  rs.getString("password");
			
			System.out.println("dbname= "+dbmobilenum);
			System.out.println("dbpassword= "+dbpassword);
			
			if(mobilenum.equals(dbmobilenum) && password.equals(dbpassword))
			{
				
				System.out.println("Form mobile= "+mobilenum);
				System.out.println("Form password= "+password);
				System.out.println("Login Success.....");
			}
			
		}
		/*
		 * else { System.out.println("Something went wrong...!!!\nTry Again....");
		 * 
		 * }
		 */
		return false;
		
		
	}
	
	private void validate123(User user) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		User user1=new User();
		
		String query = "select mobilenumber,password from userdata";
		PreparedStatement pStatement = conn.prepareStatement(query);
		
		ResultSet rs = pStatement.executeQuery();
		String dbmobilenum = rs.getString("mobilenumber");
		String dbpassword =  rs.getString("password");
		
		System.out.println("dbname= "+dbmobilenum);
		System.out.println("dbpassword= "+dbpassword);
		
		while(rs.next()) {
		if(user1.getUserMobile().equals(dbmobilenum) && user1.getPassword().equals(dbpassword))
		{
			
			System.out.println("Form mobile= "+user1.getUserMobile());
			System.out.println("Form password= "+user1.getPassword());
			System.out.println("Login Success.....");
		}
		
		else {
			System.out.println("User not there");
		}
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDAO dao=new UserDAO();
		dao.validate123(new User("9014378464","renuka"));
	}

	
	
	
}


