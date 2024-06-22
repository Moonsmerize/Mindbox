package Utilities;

import Entities.Coordinator;
import Entities.Professor;
import Entities.Student;
import Repositories.CoordinatorRepository;
import Repositories.ProfessorRepository;
import Repositories.StudentRepository;

public class Login {

    public static Student studentLogin() {
        byte attempts = 0;
        do {
            String username = ConsoleReader.inputString("username");
            String password = ConsoleReader.inputString("password");
            for (Student student : StudentRepository.getStudents()) {
                if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
                    return student;
                }
            }
            System.out.println("Username or password incorrect!\nTry again\n");
            attempts++;
        } while (attempts < 3);
        return null;
    }

    public static Professor professorLogin() {
        byte attempts = 0;
        do {
            String username = ConsoleReader.inputString("username");
            String password = ConsoleReader.inputString("password");
            for (Professor professor : ProfessorRepository.getProfessors()) {
                if (professor.getUsername().equals(username) && professor.getPassword().equals(password)) {
                    return professor;
                }
            }
            System.out.println("Username or password incorrect!\nTry again\n");
            attempts++;
        } while (attempts < 3);
        return null;
    }

    public static Coordinator coordinatorLogin() {
        byte attempts = 0;
        do {
            String username = ConsoleReader.inputString("username");
            String password = ConsoleReader.inputString("password");
            for (Coordinator coordinator : CoordinatorRepository.getCoordinators()) {
                if (coordinator.getUsername().equals(username) && coordinator.getPassword().equals(password)) {
                    return coordinator;
                }
            }
            System.out.println("Username or password incorrect!\nTry again\n");
            attempts++;
        } while (attempts < 3);
        return null;
    }

}