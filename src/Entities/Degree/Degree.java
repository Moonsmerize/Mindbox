package Entities.Degree;

import java.util.Date;
import Entities.Coordinator;
import Enum.Degrees;

public class Degree {

    private String id;
    private Degrees name;
    private byte groupsQuantity;
    private byte studentsQuantity;
    private Date creationDate;
    private Coordinator coordinator;

    public Degree(String id, Degrees name, byte groupsQuantity, byte studentsQuantity, Date creationDate,
            Coordinator coordinator) {
        this.id = id;
        this.name = name;
        this.groupsQuantity = groupsQuantity;
        this.studentsQuantity = studentsQuantity;
        this.creationDate = creationDate;
        this.coordinator = coordinator;
    }

    public Degree() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getGroupsQuantity() {
        return groupsQuantity;
    }

    public void setGroupsQuantity(byte groupsQuantity) {
        this.groupsQuantity = groupsQuantity;
    }

    public byte getStudentsQuantity() {
        return studentsQuantity;
    }

    public void setStudentsQuantity(byte studentsQuantity) {
        this.studentsQuantity = studentsQuantity;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Degrees getName() {
        return name;
    }

    public void setName(Degrees name) {
        this.name = name;
    }

}
