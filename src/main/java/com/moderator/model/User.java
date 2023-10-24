package com.moderator.model;

public class User {
	
	 	private int UserID;
	    private String firstName;
	    private String lastName;
	    private String date;
	    private String time;
	    private String email;
	    private String mobile;
	    private String password;
	    private String username;
	    

	    public User(int UserID, String firstName,String lastName,String date, String time, String email, String mobile, String password, String username) {
	        this.UserID = UserID;
	        this.firstName = firstName;
	        this.lastName=lastName;
	        this.date=date;
	        this.time=time;
	        this.email = email;
	        this.mobile = mobile;
	        this.password = password;
	        this.username = username;
	    }

	    public int getId() {
	        return UserID;
	    }

	    public String getFirstName() {
	        return firstName;
	    }
	    
	    public String getLastName() {
	        return lastName;
	    }
	    
	    public String getDate() {
	        return date;
	    }
	    public String getTime() {
	        return time;
	    }
	    public String getEmail() {
	        return email;
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getUsername() {
	        return username;
	    }
}
