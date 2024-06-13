package Utilities;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Entities.*;
import Entities.Degree.*;
import Enum.GroupType;
import Utilities.Generetors.StudentControlNumberGenerator;

public class Seeder {
        public static void initialize() {
                Coordinator coordinator1 = new Coordinator("1234", "1234", "yo", "Mero", new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #18", new Date(2020 - 1900, 05, 03), "1234567890",
                                1000);
                ComputerSystems degreeCS = new ComputerSystems("ISC2022-2024", (byte) (1), (byte) (35),
                                new Date(2022 - 1900, 8, 30), coordinator1);
                Semester semester = new Semester("ISC1", (byte) 1, degreeCS);
                Group group = new Group(degreeCS, GroupType.A, "123", semester);
                Student student = new Student("Nestor Daniel", "Luna Avila", new Date(1999 - 1900, 10, 19), "Morelia",
                                "Michoacan",
                                "12345", "Azul #18", new Date(2022 - 1900, 8, 30), degreeCS, semester, group, 95,
                                "asd12");

                Gson prettierGson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MMM-dd").create();
                String studentRepresentation = prettierGson.toJson(student);
                System.out.println(studentRepresentation);

        }
}
