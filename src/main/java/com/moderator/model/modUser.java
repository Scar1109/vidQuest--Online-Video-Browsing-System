package com.moderator.model;

public class modUser {
    private int userID;
    private String firstName;
    private String lastName;
    private String date;
    private String time;
    private String email;
    private String mobile;
    private String password;
    private String username;

    // Private constructor to prevent direct instantiation
    private modUser() {}

    // Singleton instance
    private static modUser instance;

    // Factory method to get the Singleton instance
    public static modUser getInstance() {
        if (instance == null) {
            instance = new modUser();
        }
        return instance;
    }
    
    // Factory method to create a ModUser with minimal attributes
    public modUser(int UserID, String firstName,String lastName,String date, String time, String email, String mobile, String password, String username) {
        this.userID = UserID;
        this.firstName = firstName;
        this.lastName=lastName;
        this.date=date;
        this.time=time;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.username = username;
    }

    // Factory method to create a ModUser with all attributes
    public static modUser createModUser(int userID, String firstName, String lastName, String date, String time, String email, String mobile, String password, String username) {
        modUser modUser = getInstance();
        modUser.userID = userID;
        modUser.firstName = firstName;
        modUser.lastName = lastName;
        modUser.date = date;
        modUser.time = time;
        modUser.email = email;
        modUser.mobile = mobile;
        modUser.password = password;
        modUser.username = username;
        return modUser;
    }

    public int getId() {
        return userID;
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
