package Model;

import Model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public static boolean registerUser( String username, String email,String password,  String contact ) {
        return false;
     //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (username, email, password, contact) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getCon();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getContact());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error registering user", e);
        }
    


  
    }
    
}

