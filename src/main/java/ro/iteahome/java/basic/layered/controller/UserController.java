package ro.iteahome.java.basic.layered.controller;

import ro.iteahome.java.basic.layered.exception.InvalidCredentialsException;
import ro.iteahome.java.basic.layered.service.UserService;

import java.security.InvalidParameterException;

public class UserController {

    private final UserService userService = new UserService();

    public void login(String username, String password) throws InvalidCredentialsException {
        if (username.length() < 6 || password.length() < 6) {
            throw new InvalidParameterException("Credentiale invalide");
        }

        userService.login(username, password);
    }

}
