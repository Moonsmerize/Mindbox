package Entities;

import java.util.ArrayList;
import java.util.Date;
import Entities.Degree.Degree;

public class Graduated {

    private Date graduationDate;
    private Degree degree;
    private ArrayList<Student> graduated;
    private String generation;

    public Graduated(Date graduationDate, Degree degree, ArrayList<Student> graduated, String generation) {
        this.graduationDate = graduationDate;
        this.degree = degree;
        this.graduated = graduated;
        this.generation = generation;
    }

    public Graduated() {
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public ArrayList<Student> getGraduated() {
        return graduated;
    }

    public void setGraduated(ArrayList<Student> graduated) {
        this.graduated = graduated;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

}