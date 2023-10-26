package com.studio.utill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.studio.model.video;

public class videoUtil {
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

	public static List<video> getUserVideos(int uid) {
		List<video> videos = new ArrayList<>();
		try (Connection connection = DBConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM videos where UserID =" + uid;
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				video vid = new video(resultSet.getInt("VideoID"), resultSet.getString("Title"),
						resultSet.getString("SubTitle"), resultSet.getInt("UserID"), resultSet.getString("Description"),
						resultSet.getString("Thumbnail"), resultSet.getString("Video"), resultSet.getString("Category"),
						resultSet.getString("Visibility"), resultSet.getString("Status"), resultSet.getString("Date"));
				videos.add(vid);
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return videos;
	}
	
	public static video getVideo(int vid) {
		video videos = null;
		try (Connection connection = DBConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM videos where VideoID =" + vid;
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				video vdo = new video(resultSet.getInt("VideoID"), resultSet.getString("Title"),
						resultSet.getString("SubTitle"), resultSet.getInt("UserID"), resultSet.getString("Description"),
						resultSet.getString("Thumbnail"), resultSet.getString("Video"), resultSet.getString("Category"),
						resultSet.getString("Visibility"), resultSet.getString("Status"), resultSet.getString("Date"));
				videos = vdo;
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return videos;
	}
	
	
	public static List<video> getAllVideos() {
		List<video> videos = new ArrayList<>();
		try (Connection connection = DBConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM videos";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				video vid = new video(resultSet.getInt("VideoID"), resultSet.getString("Title"),
						resultSet.getString("SubTitle"), resultSet.getInt("UserID"), resultSet.getString("Description"),
						resultSet.getString("Thumbnail"), resultSet.getString("Video"), resultSet.getString("Category"),
						resultSet.getString("Visibility"), resultSet.getString("Status"), resultSet.getString("Date"));
				videos.add(vid);
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return videos;
	}

public static boolean deleteVideo(int videoId) {
	try (Connection connection = DBConnectionUtil.getConnection()) {
		
		String sql1 = "DELETE FROM comment WHERE VideoID = ?";
		PreparedStatement statement1 = connection.prepareStatement(sql1);
		statement1.setInt(1, videoId);
		
		
        String sql2 = "DELETE FROM videos WHERE VideoID = ?";
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        statement2.setInt(1, videoId);
        
        int rowsAffected = statement2.executeUpdate();
        
        statement1.close();
        statement2.close();
        connection.close();
        
        return rowsAffected > 0;
        
    } catch (SQLException e) {
        e.printStackTrace();
        // If an exception occurs, return false to indicate failure
        return false;
    }
}

public static boolean updateVideo(int vid, String title, String subtitle, String category, String visibility, String description, String thumb) {
    Connection conn = null;
    PreparedStatement preparedStatement = null;

    try (Connection connection = DBConnectionUtil.getConnection()){
    	
        String sql = "UPDATE videos SET Title = ?, SubTitle=?, Category = ?, Visibility = ?, Description = ?, Thumbnail = ? WHERE VideoID = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, subtitle);
        preparedStatement.setString(3, category);
        preparedStatement.setString(4, visibility);
        preparedStatement.setString(5, description);
        preparedStatement.setString(6, thumb);
        preparedStatement.setInt(7, vid);

        int rowsUpdated = preparedStatement.executeUpdate();

        return rowsUpdated > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public static boolean updateVideo(int vid, String title, String subtitle, String category, String visibility, String description) {
    Connection conn = null;
    PreparedStatement preparedStatement = null;

    try (Connection connection = DBConnectionUtil.getConnection()){
    	
        String sql = "UPDATE videos SET Title = ?, SubTitle=?, Category = ?, Visibility = ?, Description = ? WHERE VideoID = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, subtitle);
        preparedStatement.setString(3, category);
        preparedStatement.setString(4, visibility);
        preparedStatement.setString(5, description);
        preparedStatement.setInt(6, vid);

        int rowsUpdated = preparedStatement.executeUpdate();

        return rowsUpdated > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
