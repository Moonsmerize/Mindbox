package Entities;

import java.util.Date;

public class Professor extends Employee {

    private String controlNumber;

    public Professor(String password, String username, String name, String lastName, Date birthDay, String city,
            String state, String curp, String address, Date registrationDate, String rfc, double salary,
            String controlNumber) {
        super(password, username, name, lastName, birthDay, city, state, curp, address, registrationDate, rfc, salary);
        this.controlNumber = controlNumber;
    }

    public Professor() {
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

}
