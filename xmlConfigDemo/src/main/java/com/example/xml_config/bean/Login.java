package com.example.xml_config.bean;

public class Login {
	
	private String email,userName,password;

	public Login() {
		super();
	}

	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Login(String email, String userName, String password) {
		super();
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
