package ro.iteahome.java.basic.layered.service;

import ro.iteahome.java.basic.layered.dao.UserDAO;
import ro.iteahome.java.basic.layered.entity.User;
import ro.iteahome.java.basic.layered.exception.InvalidCredentialsException;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void login(String username, String password) throws InvalidCredentialsException {
        for (User user : userDAO.getUserList()) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return;
            }
        }

        throw new InvalidCredentialsException();
    }
}
