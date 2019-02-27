package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cpgm.connectionservice.ConnectionFactory;
import com.cpgm.userpojoservices.User;

public class UserDAO {
	ConnectionFactory connectionFactiory;

	public User insert(User user) {

		try {
			Connection conn = connectionFactiory.getConnection();
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
		ResultSet rs = pStatement.executeQuery();
		while(rs.next())
		{
			
		}
		
		return user;
		
	}
	
	
}


