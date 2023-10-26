package com.moderator.model;

public class UserActivityLog {
    private int logID;
    private String userName;
    private int userID;
    private String date;
    private String time;
    private String log;

    public UserActivityLog(int logID, String userName, int userID, String date, String time, String log) {
        this.logID = logID;
        this.userName = userName;
        this.userID = userID;
        this.date = date;
        this.time = time;
        this.log = log;
    }

    // Add getters as you've previously defined

    // Getter for logID
    public int getLogID() {
        return logID;
    }

    // Getter for userName
    public String getUserName() {
        return userName;
    }

    // Getter for userID
    public int getUserID() {
        return userID;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Getter for time
    public String getTime() {
        return time;
    }

    // Getter for log
    public String getLog() {
        return log;
    }
}
