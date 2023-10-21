 package com.User.util;

public class User {
	
	

	private String firstName;
	private String lastName;
	private String email;
	private String pNo;
	private String pwd;
	private String username;
	
	public User( String firstName, String lastName, String email, String pNo, String pwd,
			String username) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pNo = pNo;
		this.pwd = pwd;
		this.username = username;
		
	}
	
	// Getters and setters

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getpNo() {
		return pNo;
	}
	
	public String getPwd() {
		return pwd;
	}

	public String getUsername() {
		return username;
	}

	


	
}
