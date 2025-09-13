package com.example.xml_config.bean;

import java.util.List;

public class Employee {
	
	private int id,salary,age;
	private String name;
	private Login log;
	List<String>contact_no;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, List<String> contact_no) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
	}

	public Employee(int id, int salary, String name, List<String> contact_no) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.contact_no = contact_no;
	}
	

	public Employee(int id, String name, Login log, List<String> contact_no) {
		super();
		this.id = id;
		this.name = name;
		this.log = log;
		this.contact_no = contact_no;
	}

	public Employee(int id, int salary, String name, int age, Login log, List<String> contact_no) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.age=age;
		this.log = log;
		this.contact_no = contact_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	public List<String> getContact_no() {
		return contact_no;
	}

	public void setContact_no(List<String> contact_no) {
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", log=" + log + ", contact_no="
				+ contact_no + "]";
	}
	
}
