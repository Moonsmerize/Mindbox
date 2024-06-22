package Utilities;

import Interfaces.Controller;

public class Logout implements Controller {

    public static boolean logoutValidator = false;

    @Override
    public void execute() {
        logout();
    }

    public void logout() {
        logoutValidator = true;
    }

}
