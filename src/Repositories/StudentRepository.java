package Repositories;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;

import Entities.Student;

public class StudentRepository {
    private static ArrayList<Student> students = new ArrayList<>();
    Student temporalStudent;
    int temporalIndex;

    public static void readJson() {
        Gson gson = new Gson();

        try {
            String json = new String(Files.readAllBytes(Paths.get("Students.json")));
            Type listItemType = new TypeToken<ArrayList<Student>>() {
            }.getType();

            // convert json array to List<Item>
            getStudents().addAll(gson.fromJson(json, listItemType));

            System.out.println("students arraylist length after reading json: " + getStudents().size());
        } catch (IOException e) {

        }

    }

    public static void writeInformation() {
        Gson prettierGson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        String jsonArray = prettierGson.toJson(getStudents());

        try (FileWriter fileWriter = new FileWriter("Students.json")) {
            fileWriter.write(jsonArray.toString());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Something went wrong writing");
        }
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        StudentRepository.students = students;
    }

    public Student getTemporalStudent() {
        return temporalStudent;
    }

    public void setTemporalStudent(Student temporalStudent) {
        this.temporalStudent = temporalStudent;
    }

    public int getTemporalIndex() {
        return temporalIndex;
    }

    public void setTemporalIndex(int temporalIndex) {
        this.temporalIndex = temporalIndex;
    }

    @Override
    public String toString() {
        return "StudentRepository [toString()=" + super.toString() + "]";
    }

}
