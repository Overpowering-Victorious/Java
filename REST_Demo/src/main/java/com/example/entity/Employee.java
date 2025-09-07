package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn(name = "emp_id")
public class Employee extends Person{
	

	@Size(min=10, max = 10, message = "ContactNo length should be 10 digits")
	@Pattern(regexp = "^[1-9][0-9]$")
	private String contactNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_log_fk")
	private Login login;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_addr_fk")
	private List<Address> addresses;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JoinTable(name="employee_skills", joinColumns = {@JoinColumn(name="emp_id")},inverseJoinColumns = {@JoinColumn(name="skill_id")})
	private List<Skill>skills;
	
	@JsonProperty("emp_id")
	public int getEmpId() {
		return id;
	}
	public void setEmpId(int empID) {
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
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	
	
}
