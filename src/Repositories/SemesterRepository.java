package Repositories;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Entities.Semester;

public class SemesterRepository {

    private static ArrayList<Semester> semesters = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Semesters.json")) {
            fw.write(gson.toJson(semesters));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() throws FileNotFoundException, IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Semesters.json")));
            Type listItemType = new TypeToken<ArrayList<Semester>>() {
            }.getType();
            semesters.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public static void printSemesters() {
        int index = 0;
        System.out.printf("---------------------------------------------------------------------------\n");
        System.out.printf("|                              Semesters                                  |\n");
        System.out.printf("---------------------------------------------------------------------------\n");
        System.out.printf("| %8s | %8s | %28s | %10s | %5s |\n", "id", "semester", "Degree", "Groups", "index");
        System.out.printf("---------------------------------------------------------------------------\n");
        for (Semester semester : semesters) {
            System.out.printf("| %8s | %8s | %28s | %10s | %5s |\n", semester.getId(), semester.getSemester(),
                    semester.getDegree().getName(),
                    semester.getGroups().size(), index);
            index++;
        }
        System.out.printf("---------------------------------------------------------------------------\n");
    }

    public static Semester getSemesterByIndex(int index) {
        if (index <= semesters.size() && index >= 0) {
            return semesters.get(index);
        } else {
            System.out.println("Invalid index");
            return null;
        }
    }

    public static void removeSemester(Semester semester) {
        semesters.remove(semester);
    }

    public static ArrayList<Semester> getSemesters() {
        return semesters;
    }

    public static void setSemesters(ArrayList<Semester> semesters) {
        SemesterRepository.semesters = semesters;
    }

}
