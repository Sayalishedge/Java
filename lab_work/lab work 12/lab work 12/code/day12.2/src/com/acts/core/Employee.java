package com.acts.core;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// can you override equals method : based upon id : to replace ref equality by
	// identity?
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Employee)
			return this.id.equals(((Employee) o).id);
		return false;
	}
	//To follow the contract , for correct working of HashSet
	@Override
	public int hashCode() {
		System.out.println("in hashCode");
		return id.hashCode();
	}

}
