package Utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Entities.*;
import Entities.Degree.*;
import Enum.GroupType;
import Repositories.CoordinatorRepository;
import Repositories.DegreeRepository;
import Repositories.StudentRepository;

@SuppressWarnings("deprecation")
public class Seeder {

        public static void initialize() throws IOException {
                // coordinators
                Coordinator coordinator = new Coordinator("coordinator", "coordinator", "coordinator", "coordinator",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #19", new Date(2020 - 1900, 05, 03), "1234567890",
                                1003);
                Coordinator coordinator1 = new Coordinator("coordinator1", "coordinator1", "coordinator1",
                                "coordinator1",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #18", new Date(2020 - 1900, 05, 03), "1234567890",
                                1002);
                Coordinator coordinator2 = new Coordinator("coordinator2", "coordinator2", "coordinator2",
                                "coordinator2",
                                new Date(1998 - 1900, 10, 05),
                                "Morelia",
                                "Michoacan", "1234567890", "Azul #17", new Date(2020 - 1900, 05, 03), "1234567890",
                                1001);
                // degrees
                Degree isc = new Degree("ISC", "Computer Systems Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator);
                Degree imat = new Degree("IMAT", "Materials Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator1);
                Degree elc = new Degree("ELC", "Electronics Engineering", (byte) 0, (byte) 0,
                                new Date(2000 - 1900, 8, 1), coordinator2);

                ComputerSystems degreeCS = new ComputerSystems("ISC2022-2024", (byte) (1), (byte) (35),
                                new Date(2022 - 1900, 8, 30), coordinator1);
                Semester semester = new Semester("ISC1", (byte) 1, degreeCS);
                Group group = new Group(degreeCS, GroupType.A, "123", semester);

                // students
                Student student = new Student("student1", "student1", "Nestor Daniel", "Luna Avila",
                                new Date(1999 - 1900, 10, 19), "Morelia",
                                "Michoacan",
                                "12345", "Azul #18", new Date(2022 - 1900, 8, 30), degreeCS, semester, group, "asd12");
                Student student1 = new Student("student2", "student2", "Yamile", "Garcia", new Date(2004 - 1900, 4, 18),
                                "Morelia",
                                "Michoacan",
                                "56789", "Verde #75", new Date(2022 - 1900, 8, 30), degreeCS, semester, group,
                                "asd1234");
                Student student2 = new Student("student3", "student3", "Yamile", "Carranza",
                                new Date(2004 - 1900, 4, 18),
                                "Morelia",
                                "Michoacan",
                                "56789", "Verde #75", new Date(2022 - 1900, 8, 30), degreeCS, semester, group,
                                "asd1234");
                // professor
                Professor professor = new Professor("professor1", "professor1", "proffesor1", "professor1",
                                new Date(1978 - 1900, 1, 17), "Morelia", "Michoacan", "1234", "Rosa #41",
                                new Date(2003 - 1900, 8, 4), "asda", 1500, "142cfsda");

                Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();

                StudentRepository.readInformation();
                StudentRepository.printAllStudents();
                CoordinatorRepository.readInformation();
                CoordinatorRepository.printCoordinators();
                DegreeRepository.readInformation();
                DegreeRepository.printDegrees();

        }
}
