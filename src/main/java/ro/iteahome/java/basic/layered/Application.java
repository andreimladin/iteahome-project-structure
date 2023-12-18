package ro.iteahome.java.basic.layered;

import ro.iteahome.java.basic.layered.ui.LoginUI;

public class Application {

    public static void main(String[] args) {
        LoginUI loginUI = new LoginUI();
        loginUI.login();
    }
}
