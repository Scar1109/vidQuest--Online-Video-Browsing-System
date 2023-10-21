package com.moderator.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String confirm_password;

    public User(int id, String name, String email, String mobile, String password, String confirm_password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getConfirmpassword() {
        return confirm_password;
    }
    
}

