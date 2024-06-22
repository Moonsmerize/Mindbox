package Entities;

public class Record {

    private Topic topic;
    private float score;
    private String professor;
    private float average;

    public Record(Topic topic, float score, String professor, float average) {
        this.topic = topic;
        this.score = score;
        this.professor = professor;
        this.average = average;
    }

    public Record() {
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
