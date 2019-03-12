package com.org.implementation;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.dillesh.UserDaoInterfaces.UserDaoInterface;
import com.dillesh.UserPojoServices.User;

public class UserDaoImpl implements UserDaoInterface {

	 @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	
	
	@Override
	public boolean insert(User user) {
	
		String sql = "insert into users values(?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { user.getFirstName(), user.getLastname(), user.getUserEmail(),
	    user.getUserMobile(), user.getPassword()});
		return true;
	    }


	@Override
	public List<User> getAllUserCredentials(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> getAllUserCredentials() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
