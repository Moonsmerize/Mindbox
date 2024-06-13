package Controllers;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Entities.Student;
import Utilities.ConsoleReader;
import Utilities.Generetors.StudentControlNumberGenerator;

@SuppressWarnings("deprecation")
public class StudentController {

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
        Gson studentGson = new GsonBuilder().setPrettyPrinting().create();
        String representation = studentGson.toJson(studentGson);

    }

}
