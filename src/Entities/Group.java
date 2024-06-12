package Entities;

import java.util.ArrayList;

import Entities.Degree.Degree;
import Enum.GroupType;

public class Group {

    private Degree degree;
    ArrayList<Student> students;
    private GroupType groupType;
    private String id;
    private ArrayList<Topic> topics;
    private Semester semester;

    public Group(Degree degree, GroupType groupType, String id, Semester semester) {
        this.degree = degree;
        this.students = new ArrayList<>();
        this.groupType = groupType;
        this.id = id;
        this.topics = new ArrayList<>();
        this.semester = semester;
    }

    public Group() {
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

}
