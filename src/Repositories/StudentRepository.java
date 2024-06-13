package Repositories;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Entities.Student;

public class StudentRepository {
    public ArrayList<Student> students = new ArrayList<>();
    Student temporalStudent;
    int temporalIndex;

    public StudentRepository() {
        students = new ArrayList<>();
        File file = new File("Students.json");
        if (file.exists()) {
            // readInformation()
        }
    }

    public void readInformation() {
        JSONParser parser = new JSONParser();

        try {
            Object object = parser.parse(new FileReader("Students.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray studentsArray = (JSONArray) jsonObject.get("StudentsList");

            for (int i = 0; i < studentsArray.size(); i++) {
                Student student = new Student();

                Object studentObject = studentsArray.get(i);

                JSONObject studenObjectJson = (JSONObject) studentObject;

                student.setName(studenObjectJson.get("name").toString());
                student.setLastName(studenObjectJson.get("lastName").toString());
                // student.setBirthDay(LocalDate.parse(studenObjectJson.get("birthDay").toString()));
                student.setCity(studenObjectJson.get("city").toString());
                student.setState(studenObjectJson.get("state").toString());
                student.setCurp(studenObjectJson.get("curp").toString());
                student.setAddress(studenObjectJson.get("address").toString());
                // student.setRegisterDate(Date.parse(studenObjectJson.get("registerDate").toString()));
                // student.setDegree(studenObjectJson.get("degree").toString());
                // student.setSemester(studenObjectJson.get("group").toString());
                // student.setGroup(studenObjectJson.get("group").toString());
                student.setAverage(Float.parseFloat(studenObjectJson.get("average").toString()));
                student.setControlNumber(studenObjectJson.get("controlNumber").toString());

                this.students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong (File)");
        } catch (IOException e) {
            System.out.println("Something went wrong (IO)");
        } catch (org.json.simple.parser.ParseException e) {
            System.out.println("Something went wrong (Parsing)");
        }

    }

}
