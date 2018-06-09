package com.basic;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private String gender;
	private String branchName;
	private String departmentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranchName() {
		return branchName;
	}  
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId+ "\t"+firstName+"\t"+lastName+"\t"+gender+"\t"+branchName+"\t"+departmentName;
	
	}
}
