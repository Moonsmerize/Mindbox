package Repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import Entities.Student;

public class StudentRepository {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void writeInformation() {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try (FileWriter fw = new FileWriter("Students.json")) {
            fw.write(gson.toJson(students));
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void readInformation() throws FileNotFoundException, IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
        try {
            String json = new String(Files.readAllBytes(Paths.get("Students.json")));
            Type listItemType = new TypeToken<ArrayList<Student>>() {
            }.getType();
            students.addAll(gson.fromJson(json, listItemType));
        } catch (IOException e) {

        }
    }

    public void removeStudent(Student student) {
        boolean validation = true;
        if (validation) {
            students.remove(student);
        }
    }

    public static void printAllStudents() {
        int index = 0;
        System.out.printf("-------------------------------------------------------------------------\n");
        System.out.printf("|                                 Students                              |\n");
        System.out.printf("-------------------------------------------------------------------------\n");
        System.out.printf("| %18s | %18s | %19s | %5s |\n", "Name", "Last name", "Control Number", "index");
        System.out.printf("-------------------------------------------------------------------------\n");
        for (Student student : students) {
            System.out.printf("| %18s | %18s | %19s | %5s |\n", student.getName(), student.getLastName(),
                    student.getControlNumber(), index);
            index++;
        }
        System.out.printf("-------------------------------------------------------------------------\n");

    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        StudentRepository.students = students;
    }

}
