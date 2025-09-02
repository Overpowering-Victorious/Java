package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "empId")
public class Employee extends Person{
	

	private String contactNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empLog_fk")
	private Login login;
	
	@JsonProperty("empId")
	public int getEmpID() {
		return id;
	}
	public void setEmpID(int empID) {
		this.id = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
