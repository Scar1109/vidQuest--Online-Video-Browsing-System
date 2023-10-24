package com.comment.model;

public class comment {
      
     private int VideoID ;
     private int UserID;
     private String comment;
     private int commentID;
    // private String username;
   
     //create constructors
	public comment( int VideoID, int UserID, String comment , int commentID ) {
		 
		this.VideoID = VideoID;
		this.UserID = UserID;
		this.comment = comment;
		this.commentID = commentID;	
	//	this.username = username;
	}
	
	public comment( int VideoID, int UserID, String comment  ) {
		 
		this.VideoID = VideoID;
		this.UserID = UserID;
		this.comment = comment;
	 
	}
	//create getters
	 
	 

	public comment(int commentID, String comment) {
		this.comment = comment;
		this.commentID = commentID;
		 
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
	
	public int getcommentID() {
		
		return commentID;
	}
	
// public String getUsername() {
//	return username;
//	}
// 

	 
 
    
     
     
}
