package Main;

import java.io.IOException;

import Entities.*;
import Interfaces.Controller;
import Utilities.ConsoleReader;
import Utilities.Login;
import Utilities.Logout;
import Utilities.Seeder;
import Utilities.Validators;

public class Main {

    public static int userIndex;
    Validators validator = new Validators();

    public static void main(String[] args) throws IOException {

        /*
         * to do
         * fix entity-Topic ***attribute Professor replaced for Employee***
         */

        boolean isValid = false, shutdownValidator = false;
        Object object = null;
        boolean shutdown = true;

        Seeder.initialize();

        Menu mainMenu = new Menu();

        // Controller studentController = new StudentController();
        Controller logoutController = new Logout();

        mainMenu.addMenuItem(0, new MenuItem("logout", logoutController));

        do {
            // asking for an option
            do {

                try {
                    isValid = true;
                    System.out.println("1 - Students login\n" + "2 - teachers login\n" + "3 - Coordinators login");
                    byte option = (byte) Integer
                            .parseInt(ConsoleReader.inputString("option", Validators.positiveNumberValidator()));
                    if (option == 1) {
                        object = Login.studentLogin();
                    } else if (option == 2) {
                        object = Login.professorLogin();
                    } else if (option == 3) {
                        object = Login.coordinatorLogin();
                    } else {
                        System.out.println("Not a valid option\n");
                        isValid = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Not a number\ntry again\n");
                    isValid = false;
                }
            } while (!isValid);

            // welcome message

            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println("\nWelcome " + student.getName() + " " + student.getLastName() + "\n");
            } else if (object instanceof Professor) {
                Professor professor = (Professor) object;
                System.out.println("Welcome\n" + professor.getName() + " " + professor.getLastName());
            } else if (object instanceof Coordinator) {
                Coordinator coordinator = (Coordinator) object;
                System.out.println("Welcome " + coordinator.getName() + " " + coordinator.getLastName());
            } else {
                System.out.println("System locked!!!");
                shutdown = false;
            }

            // printing menu

            do {
                mainMenu.display("Menu");
            } while (!Logout.logoutValidator);

            // login again?

            do {
                shutdownValidator = true;
                try {
                    System.out.println("\nlogin again?\n1 - yes\n2 - no");
                    byte option = (byte) Integer
                            .parseInt(ConsoleReader.inputString("option", Validators.positiveNumberValidator()));
                    if (option == 1) {
                    } else if (option == 2) {
                        shutdown = false;
                    } else {
                        System.out.println("invalid option");
                        shutdownValidator = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Not a number\nTry again\n");
                    shutdownValidator = false;
                }
            } while (!shutdownValidator);

        } while (shutdown);

    }

}
