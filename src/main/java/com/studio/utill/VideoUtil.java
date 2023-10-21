package com.studio.utill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studio.model.video;

public class VideoUtil {
    public static boolean createVideo(video vid) {
        try (Connection connection = DBConnectionUtil.getConnection()) {
            String insertQuery = "INSERT INTO Videos (Title, SubTitle, UserID, Description, Thumbnail, Video, Category, Visibility) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, vid.getTitle());
            preparedStatement.setString(2, vid.getSubTitle());
            preparedStatement.setInt(3, vid.getUserID());
            preparedStatement.setString(4, vid.getDescription());
            preparedStatement.setString(5, vid.getThumbnail());
            preparedStatement.setString(6, vid.getVideo());
            preparedStatement.setString(7, vid.getCategory());
            preparedStatement.setString(8, vid.getVisibility());

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
