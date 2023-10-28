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

    // Private constructor to prevent direct instantiation
    private video() {}

    // Singleton instance
    private static video instance;

    // Factory method to get the Singleton instance
    public static video getInstance() {
        if (instance == null) {
            instance = new video();
        }
        return instance;
    }

    // Factory method to create a video with minimal attributes
    public void createVideo(String title, String subTitle, int userID, String description, String thumbnail, String video, String category, String visibility) {
        this.title = title;
        this.subTitle = subTitle;
        this.userID = userID;
        this.description = description;
        this.thumbnail = thumbnail;
        this.video = video;
        this.category = category;
        this.visibility = visibility;
    }

    // Factory method to create a video with all attributes
    public void createVideoWithAllAttributes(int videoID, String title, String subTitle, int userID, String description, String thumbnail, String video, String category, String visibility, String status, String date) {
        this.videoID = videoID;
        this.title = title;
        this.subTitle = subTitle;
        this.userID = userID;
        this.description = description;
        this.thumbnail = thumbnail;
        this.video = video;
        this.category = category;
        this.visibility = visibility;
        this.status = status;
        this.date = date;
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
