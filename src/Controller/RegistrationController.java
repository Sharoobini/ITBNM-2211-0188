package controller;

import Model.User;
import Model.UserDAO;

import java.sql.SQLException;

public class RegistrationController {
    public static boolean registerUser( String username, String email, String password, String contact) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setContact(contact);
        try {
            return UserDAO.registerUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
