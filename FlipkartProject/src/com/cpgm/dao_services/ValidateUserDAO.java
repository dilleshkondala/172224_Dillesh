package com.cpgm.dao_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cpgm.connectionservice.ConnectionFactory;
import com.cpgm.userpojoservices.User;

public class ValidateUserDAO {
	
	
	public static void main(String[] args) {
		UserDAO userdao = new UserDAO();
		User user = new User();
		try {
			userdao.validate(user.getUserMobile(), user.getPassword());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}

}
