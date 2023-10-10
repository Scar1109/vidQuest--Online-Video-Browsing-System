package com.comment.util;

public class comment {
     private int commentID;
     private int VideoID ;
     private int UserID;
     private String comment;
   
     //create constructors
	public comment(int commentID, int videoID, int userID, String comment) {
		this.commentID = commentID;
		VideoID = videoID;
		UserID = userID;
		this.comment = comment;
	}

	//create getters
	public int getCommentID() {
		return commentID;
	}
 
	public int getVideoID() {
		return VideoID;
	}

	
	public int getUserID() {
		return UserID;
	}

	
	public String getComment() {
		return comment;
	}

	 
    
     
     
}
