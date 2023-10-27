package com.moderator.model;

public class UserActivityLog {
    private int logID;
    private String userName;
    private int userID;
    private String date;
    private String time;
    private String log;

    // Private constructor to prevent direct instantiation
    private UserActivityLog() {}

    // Singleton instance
    private static UserActivityLog instance;

    // Factory method to get the Singleton instance
    public static UserActivityLog getInstance() {
        if (instance == null) {
            instance = new UserActivityLog();
        }
        return instance;
    }

    // Factory method to create a UserActivityLog with all attributes
    public static UserActivityLog createUserActivityLog(int logID, String userName, int userID, String date, String time, String log) {
        UserActivityLog logInstance = getInstance();
        logInstance.logID = logID;
        logInstance.userName = userName;
        logInstance.userID = userID;
        logInstance.date = date;
        logInstance.time = time;
        logInstance.log = log;
        return logInstance;
    }

    public int getLogID() {
        return logID;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLog() {
        return log;
    }
}
