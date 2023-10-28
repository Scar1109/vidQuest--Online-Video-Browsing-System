package com.comment.model;

public class comment {
    private int videoID;
    private int userID;
    private String comment;
    private int commentID;

    // Private constructor to prevent direct instantiation
    private comment() {}

    // Singleton instance
    private static comment instance;

    // Factory method to get the Singleton instance
    public static comment getInstance() {
        if (instance == null) {
            instance = new comment();
        }
        return instance;
    }

    // Factory method to create a comment with all attributes
    public static comment createComment(int videoID, int userID, String comment, int commentID) {
        comment commentInstance = getInstance();
        commentInstance.videoID = videoID;
        commentInstance.userID = userID;
        commentInstance.comment = comment;
        commentInstance.commentID = commentID;
        return commentInstance;
    }

    // Factory method to create a comment without a commentID
    public static comment createComment(int videoID, int userID, String comment) {
        return createComment(videoID, userID, comment, -1);
    }

    // Factory method to create a comment with only a comment and commentID
    public static comment createComment(String comment, int commentID) {
        return createComment(-1, -1, comment, commentID);
    }

    public int getVideoID() {
        return videoID;
    }

    public int getUserID() {
        return userID;
    }

    public String getComment() {
        return comment;
    }

    public int getCommentID() {
        return commentID;
    }
}
