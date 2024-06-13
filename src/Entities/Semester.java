package Entities;

import java.util.ArrayList;

import Entities.Degree.Degree;

public class Semester {

    private String id;
    private byte semester;
    private Degree degree;
    private ArrayList<Group> groups;

    public Semester(String id, byte semester, Degree degree) {
        this.id = id;
        this.semester = semester;
        this.degree = degree;
        this.groups = new ArrayList<>();
    }

    public Semester() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

}
