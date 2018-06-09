package com.basic;



public class StudentDetails {
	public void printStudent(Student s1) {
		System.out.println("printStudent " + s1);
	}
	public static void main(String args[]) {
		Student s1=new Student();
		Student s2=new Student();
		s1.setStudentId(1);
		s1.setFirstName("kowsalya");
		s1.setLastName("chinraj");
		s1.setGender("female");
		s1.setBranchName("be");
		s1.setDepartmentName("ece");
		s2.setStudentId(2);
		s2.setFirstName("priya");
		s2.setLastName("kumar");
		s2.setGender("female");
		s2.setBranchName("be");
		s2.setDepartmentName("ece");
		StudentDetails sd=new StudentDetails();
		sd.printStudent(s1);
		
		
	}

}
