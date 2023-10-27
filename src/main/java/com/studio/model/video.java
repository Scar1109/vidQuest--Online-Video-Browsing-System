package com.studio.model;

public class video {
    private int videoID;
    private String title;
    private String subTitle;
    private int userID;
    private String description;
    private String thumbnail;
    private String video;
    private String category;
    private String visibility;
    private String status;
    private String date;

    // Private constructor to enforce the use of factory methods
    private video() {}

    // Factory method to create a video with minimal attributes
    public static video createVideo(String title, String subTitle, int userID, String description, String thumbnail, String video, String category, String visibility) {
        video video1 = new video();
        video1.title = title;
        video1.subTitle = subTitle;
        video1.userID = userID;
        video1.description = description;
        video1.thumbnail = thumbnail;
        video1.video = video;
        video1.category = category;
        video1.visibility = visibility;
        return video1;
    }

    // Factory method to create a video with all attributes
    public static video createVideoWithAllAttributes(int videoID, String title, String subTitle, int userID, String description, String thumbnail, String video, String category, String visibility, String status, String date) {
        video video1 = new video();
        video1.videoID = videoID;
        video1.title = title;
        video1.subTitle = subTitle;
        video1.userID = userID;
        video1.description = description;
        video1.thumbnail = thumbnail;
        video1.video = video;
        video1.category = category;
        video1.visibility = visibility;
        video1.status = status;
        video1.date = date;
        return video1;
    }

    public int getVideoID() {
        return videoID;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public int getUserID() {
        return userID;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getVideo() {
        return video;
    }

    public String getCategory() {
        return category;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }
}
