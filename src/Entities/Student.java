package Entities;

import java.util.Date;
import java.util.HashMap;
import Entities.Degree.Degree;

public class Student {

    private String username;
    private String password;
    private String name;
    private String lastName;
    private Date birthDay;
    private String city;
    private String state;
    private String curp;
    private String address;
    private Date registerDate;
    private Degree degree;
    private Semester semester;
    private Group group;
    private float average;
    private String controlNumber;
    private HashMap<String, Historical> historical;

    public Student(String password, String username, String name, String lastName, Date birthDay, String city,
            String state, String curp, String address, Date registerDate, Degree degree, Semester semester, Group group,
            String controlNumber) {

        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.city = city;
        this.state = state;
        this.curp = curp;
        this.address = address;
        this.registerDate = registerDate;
        this.degree = degree;
        this.semester = semester;
        this.group = group;
        this.average = 0;
        this.controlNumber = controlNumber;
        this.historical = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public HashMap<String, Historical> getHistorical() {
        return historical;
    }

    public void setHistorical(HashMap<String, Historical> historical) {
        this.historical = historical;
    }

}
