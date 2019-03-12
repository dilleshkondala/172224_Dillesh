package com.dillesh.UserServiceInterfaces;

import com.dillesh.UserPojoServices.Login;
import com.dillesh.UserPojoServices.User;

public interface UserServiceInterface {
	
	public boolean addUser(User user); 
	public User validateUser();
	
	

}
