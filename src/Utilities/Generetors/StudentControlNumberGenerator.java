package Utilities.Generetors;

public class StudentControlNumberGenerator {

    private static int index = -1;

    public static String generateControlNumber(String name, String degree, String digits) {
        index++;
        return (name + digits + degree + String.valueOf(index)).toUpperCase();
    }

}
