package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cpgm.connectionservice.ConnectionFactory;

public class ValidateUserDAO {
	public boolean validate(String mobilenum, String password) throws ClassNotFoundException, SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		String query = "select * from userdata";
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(4, "mobilenum");
		pStatement.setString(5, "password");
		ResultSet rs = pStatement.executeQuery(query);
		while(rs.next())
		{
			String dbmobilenum = rs.getString("mobilenum");
			String dbpassword =  rs.getString("password");
			if(mobilenum.equals(dbmobilenum) && password.equals(dbpassword))
			{
			  return true;
			}
		}
		
		return false;
	}

}
