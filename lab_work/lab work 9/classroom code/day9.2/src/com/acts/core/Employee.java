package com.acts.core;

public class Employee {
	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	// override equals method to replace ref equality by content equality
	// content => emp id based
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Employee) {
			Employee e=(Employee)o;
			return this.empId == e.empId && this.name.equals(e.name);
		}
		return false;
	}

}
