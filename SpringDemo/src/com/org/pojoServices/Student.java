package com.org.pojoServices;

public class Student {
	String studentName;
	int studentId;
	String studentDept;
	String studentGrade;
	
	
	
	public Student() {
		super();
	}

	public Student(String studentName, int studentId, String studentDept, String studentGrade) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentDept = studentDept;
		this.studentGrade = studentGrade;
	}

	


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public void StudentInfo()
	{
		System.out.println("Student Name= "+studentName);
		System.out.println("Student ID= "+studentId);
		System.out.println("Student Dept= "+studentDept);
		System.out.println("Student Grade= "+studentGrade);
	}

}
