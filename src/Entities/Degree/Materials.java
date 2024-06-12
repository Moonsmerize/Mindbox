package Entities.Degree;

import java.util.Date;

import Entities.Coordinator;

public class Materials extends Degree {

    public Materials(String id, byte groupsQuantity, byte studentsQuantity, Date creationDate,
            Coordinator coordinator) {
        super(id, "Materials", groupsQuantity, studentsQuantity, creationDate, coordinator);
    }

}
