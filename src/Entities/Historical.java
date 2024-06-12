package Entities;

public class Historical {

    private String topic;
    private float score;
    private String professor;
    private float average;

    public Historical(String topic, float score, String professor, float average) {
        this.topic = topic;
        this.score = score;
        this.professor = professor;
        this.average = average;
    }

    public Historical() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

}
