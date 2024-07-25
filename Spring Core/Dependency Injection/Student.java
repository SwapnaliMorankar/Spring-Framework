package com.springcore;

public class Student {

	private int studentID;
	private String studentName;
	private String studentCity;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("Setting ID");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Name");
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		System.out.println("Setting City");
		this.studentCity = studentCity;
	}
	
	public Student(int studentID, String studentName, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	
}
