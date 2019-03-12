package com.dillesh.UserPojoServices;

public class User {
	private String firstName;
	private String lastname;
	private String userEmail;
	private String userMobile;
	private String password;
	
	public User() {
		super();
	}
	

	public User(String userMobile, String password) {
		super();
		this.userMobile = userMobile;
		this.password = password;
	}


	public User(String firstName, String lastname, String userEmail, String userMobile, String password) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastname=" + lastname + ", userEmail=" + userEmail + ", userMobile="
				+ userMobile + ", password=" + password + "]";
	}

	
}
