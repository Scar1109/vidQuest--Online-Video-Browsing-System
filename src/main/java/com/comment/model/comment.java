package com.comment.model;

public class comment {
      
     private int VideoID ;
     private int UserID;
     private String comment;
   
     //create constructors
	public comment( int VideoID, int UserID, String comment) {
		 
		this.VideoID = VideoID;
		this.UserID = UserID;
		this.comment = comment;
	}

	//create getters
	 
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
