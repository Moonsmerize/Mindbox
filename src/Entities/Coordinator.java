package Entities;

import java.util.Date;

public class Coordinator extends Employee {

    public Coordinator(String password, String username, String name, String lastName, Date birthDay, String city,
            String state, String curp,
            String address,
            Date registrationDate, String rfc, double salary) {
        super(password, username, name, lastName, birthDay, city, state, curp, address, registrationDate, rfc, salary);
    }

}
