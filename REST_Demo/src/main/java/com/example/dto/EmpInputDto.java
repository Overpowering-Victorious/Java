package com.example.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class EmpInputDto {
	
//	@NotBlank(message = "Name cannot be blank")
//	@NotEmpty(message = "Name shouldn't be empty")
//	@NotNull(message = "Name cannot be null")
	@Pattern(regexp = "^[a-zA-Z]{3,15}$", message = "Name should only contain letters and should be of 3 to 15 character long.")
	private String name;
	
	@Size(min=10, max = 10, message = "ContactNo length should be 10 digits")
	@Pattern(regexp = "^[1-9][0-9]$")
	private String contactNo;
	
	
	private String email;
	private String password;
	
	public EmpInputDto() {
		super();
	}

//	public EmpInputDto(String name, String contactNo, String email, String password) {
//		super();
//		this.name = name;
//		this.contactNo = contactNo;
//		this.email = email;
//		this.password = password;
//	}
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
