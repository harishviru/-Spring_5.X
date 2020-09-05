package com.har.beans;

public class Employee {

	private String empName;

	public Employee() {
      System.out.println("Employee. 0-param constructor");
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	
	
}
