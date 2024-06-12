package Entities.Degree;

import java.util.Date;

import Entities.Coordinator;

public class Degree {

    private String id;
    private String name;
    private byte groupsQuantity;
    private byte studentsQuantity;
    private Date creationDate;
    private Coordinator coordinator;

    public Degree(String id, String name, byte groupsQuantity, byte studentsQuantity, Date creationDate,
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

}
