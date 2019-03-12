package com.cpgm.userinfo;

import java.sql.Date;

public class UserInfo {
	private String uname;
	private int userid;
	private long mobilenum;
	private String address;
	private Date date;
	
	public UserInfo(String uname, int uid, long mobilenum, String address, Date date) {
		super();
		this.uname = uname;
		this.userid = uid;
		this.mobilenum = mobilenum;
		this.address = address;
		this.date = date;
	}

	public UserInfo() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUid() {
		return userid;
	}

	public void setUid(int uid) {
		this.userid = uid;
	}

	public long getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
