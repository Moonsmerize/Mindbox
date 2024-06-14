package Utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import Entities.*;
import Entities.Degree.*;
import Enum.GroupType;
import Repositories.DegreeRepository;
import Repositories.StudentRepository;
import Utilities.Generetors.StudentControlNumberGenerator;

public class Seeder {
        public static void initialize() {
                Coordinator coordinator = new Coordinator("coordinator", "coorinator", "coordinator", "coordinator",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #19", new Date(2020 - 1900, 05, 03), "1234567890",
                                1003);
                Coordinator coordinator1 = new Coordinator("coordinator1", "coordinator1", "coorinator1", "coorinator1",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #18", new Date(2020 - 1900, 05, 03), "1234567890",
                                1002);
                Coordinator coordinator2 = new Coordinator("coodinator2", "coodinator2", "coordinator2", "coordinator2",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #17", new Date(2020 - 1900, 05, 03), "1234567890",
                                1001);

                ComputerSystems degreeCS = new ComputerSystems("ISC2022-2024", (byte) (1), (byte) (35),
                                new Date(2022 - 1900, 8, 30), coordinator1);
                Semester semester = new Semester("ISC1", (byte) 1, degreeCS);
                Group group = new Group(degreeCS, GroupType.A, "123", semester);

                // students
                Student student = new Student("Nestor Daniel", "Luna Avila", new Date(1999 - 1900, 10, 19), "Morelia",
                                "Michoacan",
                                "12345", "Azul #18", new Date(2022 - 1900, 8, 30), degreeCS, semester, group, 91,
                                "asd12");
                Student student1 = new Student("Yamile", "Garcia", new Date(2004 - 1900, 4, 18), "Morelia",
                                "Michoacan",
                                "56789", "Verde #75", new Date(2022 - 1900, 8, 30), degreeCS, semester, group, 90,
                                "asd1234");

                // StudentRepository.getStudents().add(student);
                // StudentRepository.getStudents().add(student1);
                // StudentRepository.writeInformation();

                // degrees
                Degree isc = new Degree("ISC", "Computer Systems Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator);
                Degree imat = new Degree("ISC", "Materials Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator1);
                Degree elc = new Degree("ISC", "Electronics Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator2);

                DegreeRepository.getDegrees().add(elc);
                DegreeRepository.getDegrees().add(isc);
                DegreeRepository.getDegrees().add(imat);

                DegreeRepository.writeDegrees();

                StudentRepository.getStudents().clear();

                System.out.println("students arraylist length before reading json: "
                                + StudentRepository.getStudents().size());

                StudentRepository.readJson();
        }
}
