package Utilities;

import Entities.*;
import Interfaces.Controller;

public class Main {

    public static int logoutValidator;
    public static int userIndex;

    public static void main(String[] args) {

        Seeder.initialize();

        boolean shutdown = false;
        byte loggingAttempts = 0;

        Menu mainMenu = new Menu();
        // Controller bookController = new BookController();

        Controller logout = new Logout();

        do {
            String username = ConsoleReader.inputString("Username");
            String password = ConsoleReader.inputString("Password");
            if (Login.login(username, password) != null) {
                loggingAttempts = 0;
                logoutValidator = -1;
                User user = Login.login(username, password);
                System.out.println("\nWelcome " + user.getUsername() + "\n");
                mainMenu.addMenuItem(0, new MenuItem("Logout", logout));

                do {
                    mainMenu.display("Menu");
                } while (logoutValidator != 0);
                user = null;
                mainMenu.getMenuItems().clear();
                System.out.println("\nYou logged out\n");

                shutdown = !ConsoleReader.inputBoolean("Login again?");

            } else if (loggingAttempts < 2) {
                System.out.println("Username o password incorrect!! try again\n");
            } else {
                System.out.println("\nSYSTEM LOCKED!!!");
                shutdown = true;
            }
            loggingAttempts++;
        } while (!shutdown);

    }

}
