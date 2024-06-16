package Repositories;

import java.util.ArrayList;

import Entities.Semester;

public class SemesterRepository {

    private static ArrayList<Semester> semesters = new ArrayList<>();

    public static void printSemesters() {

    }

    public static void removeSemester() {

    }

    public static ArrayList<Semester> getSemesters() {
        return semesters;
    }

    public static void setSemesters(ArrayList<Semester> semesters) {
        SemesterRepository.semesters = semesters;
    }

}
