package com.dillesh.UserDaoInterfaces;

import java.util.List;

import com.dillesh.UserPojoServices.User;
import com.org.implementation.UserDaoImpl;

public interface UserDaoInterface {

		public boolean insert(User user);
		public List<User> getAllUserCredentials();
		List<User> getAllUserCredentials(User user);
		
}
