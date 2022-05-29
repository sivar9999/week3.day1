package org.system;

public class Student extends Department{
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("student name");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("student department");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("student id");
		
	

	}
	private void sts() {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj =new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.sts();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		

	}

}
