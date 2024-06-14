package Repositories;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Entities.Degree.Degree;

public class DegreeRepository {

    private static ArrayList<Degree> degrees = new ArrayList<>();

    public static void printDegrees() {

    }

    public static void writeDegrees() {

        Gson prettierGson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        String jsonArray = prettierGson.toJson(getDegrees());

        try (FileWriter fileWriter = new FileWriter("Degrees.json")) {
            fileWriter.write(jsonArray.toString());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Something went wrong writing");
        }
    }

    public static ArrayList<Degree> getDegrees() {
        return degrees;
    }

    public static void setDegrees(ArrayList<Degree> degrees) {
        DegreeRepository.degrees = degrees;
    }

}
