package Utilities;

import java.io.IOException;
import Repositories.CoordinatorRepository;
import Repositories.DegreeRepository;
import Repositories.SemesterRepository;
import Repositories.StudentRepository;
import Repositories.TopicRepository;

public class Seeder {

        public static void initialize() throws IOException {

                // coordinators
                /*
                 * Coordinator coordinator = new Coordinator("coordinator", "coordinator",
                 * "coordinator", "coordinator",
                 * new Date(1998 - 1900, 10, 05),
                 * "Morelia",
                 * "Michoacan", "1234567890", "Azul #19", new Date(2020 - 1900, 05, 03),
                 * "1234567890",
                 * 1003);
                 * Coordinator coordinator1 = new Coordinator("coordinator1", "coordinator1",
                 * "coordinator1",
                 * "coordinator1",
                 * new Date(1998 - 1900, 10, 05),
                 * "Morelia",
                 * "Michoacan", "1234567890", "Azul #18", new Date(2020 - 1900, 05, 03),
                 * "1234567890",
                 * 1002);
                 * Coordinator coordinator2 = new Coordinator("coordinator2", "coordinator2",
                 * "coordinator2",
                 * "coordinator2",
                 * new Date(1998 - 1900, 10, 05),
                 * "Morelia",
                 * "Michoacan", "1234567890", "Azul #17", new Date(2020 - 1900, 05, 03),
                 * "1234567890",
                 * 1001);
                 */

                // degrees

                /*
                 * Degree isc = new Degree("ISC", Degrees.ComputerSystemsEngineering, (byte) 0,
                 * (byte) 0,
                 * new Date(2000 - 1900, 8, 1), coordinator);
                 * Degree imat = new Degree("IMAT", Degrees.MaterialsEngineering, (byte) 0,
                 * (byte) 0,
                 * new Date(2000 - 1900, 8, 1), coordinator1);
                 * Degree elc = new Degree("ELC", Degrees.ElectronicsEngineering, (byte) 0,
                 * (byte) 0,
                 * new Date(2000 - 1900, 8, 1), coordinator2);
                 */

                // semesters
                /*
                 * Semester semesterIsc1 = new Semester("ISC1", (byte) 1, isc);
                 * Semester semesterIsc2 = new Semester("ISC2", (byte) 2, isc);
                 * Semester semesterIsc3 = new Semester("ISC3", (byte) 3, isc);
                 * Semester semesterImat1 = new Semester("IMAT1", (byte) 1, imat);
                 * Semester semesterImat2 = new Semester("IMAT2", (byte) 2, imat);
                 * Semester semesterImat3 = new Semester("IMAT3", (byte) 3, imat);
                 * Semester semesterElc1 = new Semester("ELC1", (byte) 1, elc);
                 * Semester semesterElc2 = new Semester("ELC2", (byte) 2, elc);
                 * Semester semesterElc3 = new Semester("ELC3", (byte) 3, elc);
                 */

                // groups

                /*
                 * Group group = new Group(isc, GroupType.A, "123", semesterIsc1);
                 */

                // students

                /*
                 * Student student = new Student("student1", "student1", "Nestor Daniel",
                 * "Luna Avila",
                 * new Date(1999 - 1900, 10, 19), "Morelia",
                 * "Michoacan",
                 * "12345", "Azul #18", new Date(2022 - 1900, 8, 30), isc, semesterIsc1, group,
                 * "asd12");
                 * Student student1 = new Student("student2", "student2", "Yamile", "Garcia",
                 * new Date(2004 - 1900, 4, 18),
                 * "Morelia",
                 * "Michoacan",
                 * "56789", "Verde #75", new Date(2022 - 1900, 8, 30), isc, semesterIsc1, group,
                 * "asd1234");
                 * Student student2 = new Student("student3", "student3", "Yamile", "Carranza",
                 * new Date(2004 - 1900, 4, 18),
                 * "Morelia",
                 * "Michoacan",
                 * "56789", "Verde #75", new Date(2022 - 1900, 8, 30), isc, semesterIsc1, group,
                 * "asd1234");
                 */

                // professors

                /*
                 * Professor professor = new Professor("professor1", "professor1", "professor1",
                 * "professor1",
                 * new Date(1978 - 1900, 1, 17), "Morelia", "Michoacan", "1234", "Rosa #41",
                 * new Date(2003 - 1900, 8, 4), "asda", 1500, "142cfsda");
                 * Professor professor1 = new Professor("professor2", "professor2",
                 * "professor1", "professor1",
                 * new Date(1978 - 1900, 1, 17), "Morelia", "Michoacan", "1234", "Rosa #41",
                 * new Date(2003 - 1900, 8, 4), "asda", 1500, "142cfsda");
                 * Professor professor2 = new Professor("professor3", "professor3",
                 * "professor1", "professor1",
                 * new Date(1978 - 1900, 1, 17), "Morelia", "Michoacan", "1234", "Rosa #41",
                 * new Date(2003 - 1900, 8, 4), "asda", 1500, "142cfsda");
                 */

                // topics

                /*
                 * Topic programacion1 = new Topic("ISC-Prog01", isc, group, professor);
                 * Topic programacion2 = new Topic("ISC-Prog02", isc, group, professor);
                 * Topic programacion3 = new Topic("ISC-Prog03", isc, group, professor);
                 * Topic probabilidad1 = new Topic("ISC-Pro01", isc, group, professor);
                 * Topic probabilidad2 = new Topic("ISC-Pro02", isc, group, professor);
                 * Topic probabilidad3 = new Topic("ISC-Pro03", isc, group, professor);
                 * Topic calculo1 = new Topic("ISC-Cal01", isc, group, professor);
                 * Topic calculo2 = new Topic("ISC-Cal02", isc, group, professor);
                 * Topic calculo3 = new Topic("ISC-Cal03", isc, group, professor);
                 * 
                 * Topic estadistica1 = new Topic("imat-Est01", imat, group, professor1);
                 * Topic estadistica2 = new Topic("imat-Est02", imat, group, professor1);
                 * Topic estadistica3 = new Topic("imat-Est03", imat, group, professor1);
                 * Topic contabilidad1 = new Topic("imat-Con01", imat, group, professor1);
                 * Topic contabilidad2 = new Topic("imat-Con02", imat, group, professor1);
                 * Topic contabilidad3 = new Topic("imat-Con03", imat, group, professor1);
                 * Topic calculoImat1 = new Topic("imat-Cal01", imat, group, professor1);
                 * Topic calculoImat2 = new Topic("imat-Cal01", imat, group, professor1);
                 * Topic calculoImat3 = new Topic("imat-Cal01", imat, group, professor1);
                 * 
                 * Topic redes1 = new Topic("elc-Red01", elc, group, professor2);
                 * Topic redes2 = new Topic("elc-Red02", elc, group, professor2);
                 * Topic redes3 = new Topic("elc-Red03", elc, group, professor2);
                 * Topic circuitos1 = new Topic("elc-Cir01", elc, group, professor2);
                 * Topic circuitos2 = new Topic("elc-Cir02", elc, group, professor2);
                 * Topic circuitos3 = new Topic("elc-Cir03", elc, group, professor2);
                 * Topic calculoElc1 = new Topic("elc-Cal01", elc, group, professor2);
                 * Topic calculoElc2 = new Topic("elc-Cal02", elc, group, professor2);
                 * Topic calculoElc3 = new Topic("elc-Cal03", elc, group, professor2);
                 */

                // read

                StudentRepository.readInformation();
                CoordinatorRepository.readInformation();
                DegreeRepository.readInformation();
                SemesterRepository.readInformation();
                TopicRepository.readInformation();

                // print

                StudentRepository.printAllStudents();
                CoordinatorRepository.printCoordinators();
                DegreeRepository.printDegrees();
                SemesterRepository.printSemesters();
                TopicRepository.printTopics();
        }
}
