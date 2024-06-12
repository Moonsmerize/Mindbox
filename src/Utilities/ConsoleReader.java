package Utilities;

import java.util.Scanner;

public class ConsoleReader {
    private static Scanner input = new Scanner(System.in);

    public static String inputString(String prompt) {
        System.out.println(prompt + ": ");
        String string = input.nextLine();
        return string;
    }

    public static boolean inputBoolean(String prompt) {
        System.out.println(prompt + ": ");
        boolean result = input.nextBoolean();
        return result;
    }
}
