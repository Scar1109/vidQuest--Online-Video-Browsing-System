package com.moderator.model;

public class Video {
    private int videoID;
    private String title;
    private String subTitle;
    private int userID;
    private String description;
    private String thumbnail;
    private String videoPath;
    private String category;
    private String visibility;
    private String status;
    private String date;
    private String time;

    // Private constructor to prevent direct instantiation
    private Video() {}

    // Singleton instance
    private static Video instance;

    // Factory method to get the Singleton instance
    public static Video getInstance() {
        if (instance == null) {
            instance = new Video();
        }
        return instance;
    }

    // Factory method to create a Video with all attributes
    public static Video createVideo(int videoID, String title, String subTitle, int userID, String description,
                                    String thumbnail, String videoPath, String category, String visibility,
                                    String status, String date, String time) {
        Video videoInstance = getInstance();
        videoInstance.videoID = videoID;
        videoInstance.title = title;
        videoInstance.subTitle = subTitle;
        videoInstance.userID = userID;
        videoInstance.description = description;
        videoInstance.thumbnail = thumbnail;
        videoInstance.videoPath = videoPath;
        videoInstance.category = category;
        videoInstance.visibility = visibility;
        videoInstance.status = status;
        videoInstance.date = date;
        videoInstance.time = time;
        return videoInstance;
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

    public String getVideoPath() {
        return videoPath;
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

    public String getTime() {
        return time;
    }
}
