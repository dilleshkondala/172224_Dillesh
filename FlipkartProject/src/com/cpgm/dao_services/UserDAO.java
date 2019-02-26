package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cpgm.connectionservice.ConnectionFactory;
import com.cpgm.userinfo.User;

public class UserDAO {

	ConnectionFactory connectionfactory = new ConnectionFactory();

	public User read(int userId) throws SQLException, ClassNotFoundException {
		User user = null;
		Connection connection = ConnectionFactory.getConnection();
		//System.out.println(connection);

		String query = "select * from userdetails where userid = ?";
		PreparedStatement pStatement = connection.prepareStatement(query);
		pStatement.setInt(2, userId);
		ResultSet resultSet = pStatement.executeQuery();
		
		//System.out.println(rset);

		while(resultSet.next()) {
			user = new User();
			user.setUserName(resultSet.getString("uname"));;
		} 
		return user;
		

	}

	
	
	public User insert(User user) throws ClassNotFoundException, SQLException
	{
		String query = "insert into userdetails values(?,?,?,?)";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, user.getUserName());
		pStatement.setInt(2, user.getUserId());
		pStatement.setFloat(3,user.getUserMobileNum());
		pStatement.setString(4, user.getUserAddress());
		
		
		return user;
		
	}
	
	
	public int update(int mobilenum) throws SQLException {
		return mobilenum;
		
	}
	
	
	
	
	}

