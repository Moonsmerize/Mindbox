package Repositories;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Entities.Professor;

public class ProfessorRepository {

    private static ArrayList<Professor> professors = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Degrees.json")) {
            fw.write(gson.toJson(professors));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Professors.json")));
            Type listItemType = new TypeToken<ArrayList<Professor>>() {
            }.getType();
            professors.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public static void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public static void removeProfessor(Professor professor) {
        boolean validation = false;
        if (validation) {
            professors.remove(professor);
        }
    }

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

    public static ArrayList<Professor> getProfessors() {
        return professors;
    }

    public static void setProfessors(ArrayList<Professor> professors) {
        ProfessorRepository.professors = professors;
    }

}
