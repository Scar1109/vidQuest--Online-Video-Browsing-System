 package com.User.model;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String pNo;
	private String pwd;
	private String username;
	private int uid;
	private String type;
	
	public User(int uid, String firstName, String lastName, String email, String pNo, String pwd,String username) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pNo = pNo;
		this.pwd = pwd;
		this.username = username;
		this.uid = uid;
		
	}
	
public User(int uid, String firstName, String lastName, String email, String pNo, String pwd,String username, String type) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pNo = pNo;
		this.pwd = pwd;
		this.username = username;
		this.uid = uid;
		this.type = type;
		
	}
	
	// Getters and setters

	public User(String firstName, String lastName, String email, String pNo, String pwd, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pNo = pNo;
		this.pwd = pwd;
		this.username = username;
		
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
	
	public int getuid() {
		return uid;
	}
	
	public String getType() {
		return type;
	}

	

	


	
}
