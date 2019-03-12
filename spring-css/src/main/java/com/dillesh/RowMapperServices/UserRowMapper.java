package com.dillesh.RowMapperServices;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dillesh.UserPojoServices.User;

public class UserRowMapper {

	public class UserMapper implements org.springframework.jdbc.core.RowMapper<User> {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			
		        User user = new User();
		        
		        user.setFirstName(rs.getString("firstName"));;
		        user.setLastname(rs.getString("lastname"));
		        user.setUserEmail(rs.getString("userEmail"));;
		        user.setUserMobile(rs.getString("userMobile"));
		        user.setPassword(rs.getString("password"));
		        return user;
		}

	}

}
