package Controllers;

import Entities.Semester;
import Interfaces.Controller;
import Repositories.SemesterRepository;
import Utilities.ConsoleReader;

public class SemesterController implements Controller {

    public void createSemester() {

    }

    public void advanceSemester() {
        SemesterRepository.printSemesters();
        Semester semester = getSemesterByIndex();
        semester.setSemester((byte) (semester.getSemester() + 1));
    }

    public void modifySemester() {

    }

    public void removeSemester() {

    }

    public void printSemester() {

    }

    public Semester getSemesterByIndex() {
        SemesterRepository.printSemesters();
        return SemesterRepository.getSemesterByIndex(Integer.parseInt(ConsoleReader.inputString("Index")));
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
