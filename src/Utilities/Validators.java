package Utilities;

import Interfaces.Validators.*;

public class Validators {

    public static IntegerValidator dayValidator() {
        IntegerValidator dayValidator = (value) -> value > 0 && value < 32;
        return dayValidator;
    }

    public static IntegerValidator monthValidator() {
        IntegerValidator monthValidator = (value) -> value > 0 && value < 13;
        return monthValidator;
    }

    public static IntegerValidator yearValidator() {
        IntegerValidator yearValidator = (value) -> value > 0;
        return yearValidator;
    }

    public static IntegerValidator positiveNumberValidator() {
        IntegerValidator integerValidator = (value) -> value > 0;
        return integerValidator;
    }

}
