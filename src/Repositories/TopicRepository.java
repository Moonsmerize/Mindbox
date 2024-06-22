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
import Entities.Topic;

public class TopicRepository {

    public static ArrayList<Topic> topics = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Topics.json")) {
            fw.write(gson.toJson(topics));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Topics.json")));
            Type listItemType = new TypeToken<ArrayList<Topic>>() {
            }.getType();
            topics.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public static void printTopics() {
        int index = 0;
        System.out.printf(
                "------------------------------------------------------------------------\n");
        System.out.printf(
                "|                                Topics                                |\n");
        System.out.printf(
                "------------------------------------------------------------------------\n");
        System.out.printf("| %10s | %10s | %10s | %21s | %5s |\n", "Id", "Degree Id", "Group Id", "Professor", "index");
        System.out.printf(
                "------------------------------------------------------------------------\n");
        for (Topic topic : topics) {
            System.out.printf("| %10s | %10s | %10s | %21s | %5s |\n", topic.getId(), topic.getDegree().getId(),
                    topic.getGroup().getId(), topic.getProfessor().getName() + " " + topic.getProfessor().getLastName(),
                    index);
            index++;
        }
        System.out.printf(
                "------------------------------------------------------------------------\n");
    }

    public static ArrayList<Topic> getTopics() {
        return topics;
    }

    public static void setTopics(ArrayList<Topic> topics) {
        TopicRepository.topics = topics;
    }

}
