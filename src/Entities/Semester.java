package Entities;

import java.util.ArrayList;

import Entities.Degree.Degree;

public class Semester {

    private String id;
    private Semester semester;
    private Degree degree;
    private ArrayList<Group> groups;

    public Semester(String id, Semester semester, Degree degree, ArrayList<Group> groups) {
        this.id = id;
        this.semester = semester;
        this.degree = degree;
        this.groups = groups;
    }

    public Semester() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
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

}
