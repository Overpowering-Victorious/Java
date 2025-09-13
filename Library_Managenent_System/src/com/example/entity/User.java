package com.example.entity;

import java.util.Date;

public class User {
	private int id;
	private String username, fullName, contactNo, email, password, role;
	private Date dob;
	
	public User(){}

	public User(int id, String username, String fullName, String contactNo, String email, String password, String role, Date dob)
	{
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.role = role;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", fullName=" + fullName + ", contactNo=" + contactNo
				+ ", email=" + email + ", password=" + password + ", role=" + role + ", dob=" + dob + "]";
	}
}
