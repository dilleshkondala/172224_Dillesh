package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cpgm.userinfo.UserInfo;

public class UserDAO {
	
	ConnectionFactory connFactory = new ConnectionFactory();
	
	public int insert(UserInfo user) throws SQLException {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		return 0;
	
		
	}
	
	public UserInfo read(String uname) throws SQLException {
		String query = "select * from userdetails";
		Connection con = ConnectionFactory
		PreparedStatement preparedStmt = con.prepareStatement(query);
		return null;
	
		
		
	}
		
	public int update(int mobilenum) throws SQLException {
		return mobilenum;
		
		
	}
	public int delete(int uid) throws SQLException {
		return uid;
		
	
	}


}
