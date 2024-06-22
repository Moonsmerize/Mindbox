package Utilities;

import java.util.Scanner;

import Interfaces.Validators.IntegerValidator;
import Interfaces.Validators.StringValidator;

public class ConsoleReader {
    private static Scanner input = new Scanner(System.in);

    public static String inputString(String prompt) {
        System.out.print(prompt + ": ");
        String string = input.nextLine();
        return string;
    }

    public static boolean inputBoolean(String prompt) {
        System.out.print(prompt + ": ");
        boolean result = input.nextBoolean();
        return result;
    }

    public static String inputString(String prompt, StringValidator stringValidator) {
        System.out.print(prompt + ": ");
        String string = input.nextLine();
        return string;
    }

    public static String inputString(String prompt, IntegerValidator integerValidator) {
        System.out.print(prompt + ": ");
        String string = input.nextLine();
        return string;
    }

    public static String inputInteger(String prompt, IntegerValidator integerValidator) {
        System.out.print(prompt + ": ");
        String string = input.nextLine();
        return string;
    }
}
