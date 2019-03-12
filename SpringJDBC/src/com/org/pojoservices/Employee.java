package com.org.pojoservices;

import javax.xml.crypto.Data;

public class Employee {
	private int deptId;
	private int empId;
	private String empName;
	private double empSal;
	private int comm;
	private String job;
	private String mgr;
	private String hireDate;
		
	
	public Employee() {
		super();
	}

	public Employee(int deptId, int empId, String empName, double empSal, int comm, String job, String mgr,
			String hireDate) {
		super();
		this.deptId = deptId;
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.comm = comm;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [deptId=" + deptId + ", empNo=" + empId + ", empName=" + empName + ", empSal=" + empSal
				+ ", comm=" + comm + ", job=" + job + ", mgr=" + mgr + ", hireDate=" + hireDate + ", getDeptId()="
				+ getDeptId() + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpSal()="
				+ getEmpSal() + ", getComm()=" + getComm() + ", getJob()=" + getJob() + ", getMgr()=" + getMgr()
				+ ", getHireDate()=" + getHireDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
