package Repositories;

import java.util.ArrayList;

import Entities.Professor;

public class ProfessorRepository {

    public static ArrayList<Professor> professors = new ArrayList<>();

    public static void printProfessors() {
        int index = 0;
        System.out.printf("---------------------------------------------------------------------------------------");
        System.out.printf("                                     Professors                                        ");
        System.out.printf("---------------------------------------------------------------------------------------");
        System.out.printf("| %18s | %18s | %19s | %5s |\n", "Name", "Last name", "Control Number", "index");
        for (Professor professor : professors) {
            System.out.printf("| %18s | %18s | %19s | %5s |\n", professor.getName(), professor.getLastName(),
                    professor.getControlNumber(), index);
            index++;
        }
    }

}
