package com.moderator.model;

public class Comment {
    private int commentID;
    private int videoID;
    private int userID;
    private String comment;
    private String date;
    private String time;

    // Private constructor to prevent direct instantiation
    private Comment() {}

    // Singleton instance
    private static Comment instance;

    // Factory method to get the Singleton instance
    public static Comment getInstance() {
        if (instance == null) {
            instance = new Comment();
        }
        return instance;
    }

    // Factory method to create a Comment with all attributes
    public static Comment createComment(int commentID, int videoID, int userID, String comment, String date, String time) {
        Comment commentInstance = getInstance();
        commentInstance.commentID = commentID;
        commentInstance.videoID = videoID;
        commentInstance.userID = userID;
        commentInstance.comment = comment;
        commentInstance.date = date;
        commentInstance.time = time;
        return commentInstance;
    }

    public int getCommentId() {
        return commentID;
    }

    public int getVideoId() {
        return videoID;
    }

    public int getUserId() {
        return userID;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
