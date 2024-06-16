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

public class CoordinatorRepository {

    private static ArrayList<Coordinator> coordinators = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Coordinators.json")) {
            fw.write(gson.toJson(coordinators));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() throws FileNotFoundException, IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Coordinators.json")));
            Type listItemType = new TypeToken<ArrayList<Coordinator>>() {
            }.getType();
            coordinators.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public static void printCoordinators() {
        int index = 0;
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("|                 Coordinators                    |\n");
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("| %18s | %18s | %5s |\n", "Name", "Last name", "index");
        System.out.printf("---------------------------------------------------\n");
        for (Coordinator coordinator : coordinators) {
            System.out.printf("| %18s | %18s | %5s |\n", coordinator.getName(), coordinator.getLastName(),
                    index);
            index++;
        }
        System.out.printf("---------------------------------------------------\n");
    }

    public static ArrayList<Coordinator> getCoordinators() {
        return coordinators;
    }

    public static void setCoordinators(ArrayList<Coordinator> coordinators) {
        CoordinatorRepository.coordinators = coordinators;
    }

}
