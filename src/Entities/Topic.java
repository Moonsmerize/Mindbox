package Entities;

import Entities.Degree.Degree;

public class Topic {

    private String id;
    private Degree degree;
    private Group group;
    private Professor professor;

    public Topic(String id, Degree degree, Group group, Professor professor) {
        this.id = id;
        this.degree = degree;
        this.group = group;
        this.professor = professor;
    }

    public Topic() {
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
