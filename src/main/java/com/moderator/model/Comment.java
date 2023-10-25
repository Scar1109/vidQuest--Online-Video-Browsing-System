package com.moderator.model;

public class Comment {

    private int commentID;
    private int videoID;
    private int userID;
    private String comment;
    private String date;
    private String time;

    public Comment(int commentID,int videoID,int userID,String comment,String date, String time) {
        this.commentID = commentID;
        this.videoID = videoID;
        this.userID = userID;
        this.comment = comment;
        this.date = date;
        this.time = time;
        
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
    