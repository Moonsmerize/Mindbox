package Entities;

import java.util.ArrayList;
import java.util.Date;

public class Employee extends User {

    private String name;
    private String lastName;
    private Date birthDay;
    private String city;
    private String state;
    private String curp;
    private String address;
    private Date registrationDate;
    private String rfc;
    private ArrayList<Topic> topics;
    private double salary;

    public Employee(String password, String username, String name, String lastName, Date birthDay, String city,
            String state, String curp, String address, Date registrationDate, String rfc, double salary) {
        super(password, username);
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.city = city;
        this.state = state;
        this.curp = curp;
        this.address = address;
        this.registrationDate = registrationDate;
        this.rfc = rfc;
        this.topics = new ArrayList<>();
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
