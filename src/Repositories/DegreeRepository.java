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

import Entities.Coordinator;
import Entities.Degree.Degree;
import Utilities.DateFormatter;

public class DegreeRepository {

    public static ArrayList<Degree> degrees = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Degrees.json")) {
            fw.write(gson.toJson(degrees));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Degrees.json")));
            Type listItemType = new TypeToken<ArrayList<Degree>>() {
            }.getType();
            degrees.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public static void printDegrees() {
        int index = 0;
        System.out.printf(
                "--------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf(
                "|                                                         Degrees                                                  |\n");
        System.out.printf(
                "--------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("| %25s | %7s | %28s | %10s | %7s | %12s | %5s |\n", "Coordinator", "Id", "Name",
                "#Students",
                "#Groups",
                "Creation day", "index");
        System.out.printf(
                "--------------------------------------------------------------------------------------------------------------------\n");
        for (Degree degree : degrees) {
            System.out.printf("| %25s | %7s | %28s | %10s | %7s | %12s | %5s |\n",
                    degree.getCoordinator().getName().concat(" " + degree.getCoordinator().getLastName()),
                    degree.getId(),
                    degree.getName(), degree.getStudentsQuantity(), degree.getGroupsQuantity(),
                    DateFormatter.Format(degree.getCreationDate()), index);
            index++;
        }
        System.out.printf(
                "--------------------------------------------------------------------------------------------------------------------\n");
    }

}
