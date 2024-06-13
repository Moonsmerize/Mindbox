package Entities.Degree;

import java.util.Date;
import Entities.Coordinator;

public class ComputerSystems extends Degree {

    public ComputerSystems(String id, byte groupsQuantity, byte studentsQuantity, Date creationDate,
            Coordinator coordinator) {
        super(id, "Computer Systems Engineering", groupsQuantity, studentsQuantity, creationDate, coordinator);
    }

}
