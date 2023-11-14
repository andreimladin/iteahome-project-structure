package ro.iteahome.ui;

import ro.iteahome.controller.UserController;
import ro.iteahome.exception.InvalidCredentialsException;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class LoginUI {

    private UserController userController = new UserController();

    public void login() {
        boolean loginSucceeded = false;
        int count = 0;
        while (!loginSucceeded && count < 3) {
            try {
                System.out.println("Va rugam introduceti credentialele dvs");
                System.out.println("Username:");
                Scanner keyboard = new Scanner(System.in);
                String username = keyboard.next();
                System.out.println("Password:");
                String password = keyboard.next();
                userController.login(username, password);
                loginSucceeded = true;
                System.out.println("Login cu success");
            } catch (InvalidCredentialsException e) {
                System.out.println("Credentiale invalide");
                loginSucceeded = false;
                count++;
            } catch (InvalidParameterException e){
                System.out.println("Credentiale in format invalid");
                loginSucceeded = false;
                count++;
            }
        }
    }
}
