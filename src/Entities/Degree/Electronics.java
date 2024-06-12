package Entities.Degree;

import java.util.Date;

import Entities.Coordinator;

public class Electronics extends Degree {

    public Electronics(String id, byte groupsQuantity, byte studentsQuantity, Date creationDate,
            Coordinator coordinator) {
        super(id, "Electronics", groupsQuantity, studentsQuantity, creationDate, coordinator);
    }

}
