package com.har.beans;

public class Student {

	private String studName;
	
	public Student() {
		System.out.println("Student. 0-param constructor");
	}

	public Student(String studName) {
		System.out.println("Student. 1-param constructor");
		this.studName = studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + "]";
	}
	
}
