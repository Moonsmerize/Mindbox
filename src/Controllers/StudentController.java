package Controllers;

import org.json.JSONArray;
import com.google.gson.Gson;

import Entities.Menu;
import Entities.MenuItem;
import Entities.Student;
import Interfaces.Controller;
import Repositories.StudentRepository;
import Utilities.ConsoleReader;
import Utilities.Generetors.StudentControlNumberGenerator;

public class StudentController implements Controller {

    public void createStudent() {
        String name = ConsoleReader.inputString("Name");
        String lastName = ConsoleReader.inputString("Last Name");
        String birthday = ConsoleReader.inputString("Birthday /nyyyy-MM-dd");
        String city = ConsoleReader.inputString("City");
        String state = ConsoleReader.inputString("State");
        String adrress = ConsoleReader.inputString("Address");
        String registrationday = ConsoleReader.inputString("Registration day \nyyyy-MM-dd");
        float average = Float.parseFloat(ConsoleReader.inputString("name"));
        String controlnumber = StudentControlNumberGenerator.generateControlNumber(name.substring(0, 1), "ISC",
                birthday.substring(0, 2));
        Student student = new Student();
    }

    public static void modifyStudent() {

        // get student

        // modify student

    }

    public void removeStudent() {
        StudentRepository.printAllStudents();
        Student student = getStudentByIndex();

    }

    public Student getStudentByIndex() {
        StudentRepository.printAllStudents();
        return StudentRepository.getStudents().get(Integer.parseInt(ConsoleReader.inputString("Index")));
    }

    @Override
    public void execute() {

        Menu subMenu = new Menu();
        Controller createStudent = () -> createStudent();
        Controller modifyStudent = () -> modifyStudent();
        Controller removeStudent = () -> removeStudent();
        // Controller printStudent = () -> printStudent();

        subMenu.addMenuItem(1, new MenuItem("Create student", createStudent));
        subMenu.addMenuItem(2, new MenuItem("Modify student", modifyStudent));
        subMenu.addMenuItem(3, new MenuItem("Remove student", removeStudent));
        // subMenu.addMenuItem(4, new MenuItem("Print student", printStudent));
        subMenu.display("Author Menu");

    }

}
