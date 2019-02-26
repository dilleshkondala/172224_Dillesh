package com.cpgm.userinfo;

import java.sql.Date;

public class User {
	
	private String userName;
	private int userId;
	private long userMobileNum;
	private String userAddress;
	
	
	public User() {
		super();
	}


	public User(String userName, int userId, long userMobileNum, String userAddress) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userMobileNum = userMobileNum;
		this.userAddress = userAddress;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public long getUserMobileNum() {
		return userMobileNum;
	}


	public void setUserMobileNum(long userMobileNum) {
		this.userMobileNum = userMobileNum;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userMobileNum=" + userMobileNum
				+ ", userAddress=" + userAddress + "]";
	}

	
	

	

}
