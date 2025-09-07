package com.example.dto;

public class EmpOutputDto {
	
	private String name;
	private String contactNo;
	private String email;
	
	
	public EmpOutputDto() {
		super();
	}

	public EmpOutputDto(String name, String contactNo, String email) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
