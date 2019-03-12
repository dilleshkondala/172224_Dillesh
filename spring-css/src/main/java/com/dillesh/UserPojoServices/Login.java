package com.dillesh.UserPojoServices;

public class Login {
	private String mobileNum;
	private String password;
	
	
	public Login() {
		super();
	}


	public Login(String mobileNum, String password) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
	}


	public String getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [mobileNum=" + mobileNum + ", password=" + password + "]";
	}
	
	

}
