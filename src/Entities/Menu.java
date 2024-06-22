package Entities;

import java.util.HashMap;

import Utilities.ConsoleReader;

public class Menu {
    private HashMap<Integer, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
    }

    public void display(String prompt) {
        boolean validOption = false;
        int option = -1;
        do {
            try {
                validOption = true;
                System.out.println(prompt);
                for (Integer key : menuItems.keySet()) {
                    MenuItem menuItem = menuItems.get(key);
                    System.out.println(key + " - " + menuItem.getText());
                }
                option = Integer.parseInt(ConsoleReader.inputString("Option"));
                if (option >= 0 && option < menuItems.size()) {
                    MenuItem menuItem = menuItems.get(option);
                    menuItem.getController().execute();
                } else {
                    System.out.println("Invalid option\ntry again\n");
                    validOption = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a number\nTry again\n");
                validOption = false;
            }
        } while (!validOption);

    }

    public void addMenuItem(int key, MenuItem menuItem) {
        menuItems.put(key, menuItem);
    }

    public HashMap<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<Integer, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}