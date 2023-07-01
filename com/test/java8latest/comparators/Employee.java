package com.test.java8latest.comparators;



public class Employee {

	private final int age;
	private final String fullName;
	private final String lastName;
	private final String department;
	private final String gender;
	public int getAge() {
		return age;
	}
	public String getFullName() {
		return fullName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	public Employee(int age, String fullName, String lastName, String department, String gender) {
		super();
		this.age = age;
		this.fullName = fullName;
		this.lastName = lastName;
		this.department = department;
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", fullName=" + fullName + ", lastName=" + lastName + ", department="
				+ department + ", gender=" + gender + "]";
	}
	

	
	
}