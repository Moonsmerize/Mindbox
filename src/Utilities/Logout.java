package Utilities;

import Interfaces.Controller;

public class Logout implements Controller {

    @Override
    public void execute() {
        logOut();
    }

    public void logOut() {
        Main.logoutValidator = 0;
    }

}
