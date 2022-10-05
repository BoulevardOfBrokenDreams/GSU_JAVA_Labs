package Lab3;

import java.util.Date;

public class Olympiad {
    private Employee tutor;
    private Institution eventPlace;
    private Subject subject;
    private Date eventDate;
    private int stage;

    public Olympiad(Employee tutor, Institution eventPlace, Subject subject, Date eventDate, int stage) {
        this.tutor = tutor;
        this.eventPlace = eventPlace;
        this.subject = subject;
        this.eventDate = eventDate;
        this.stage = stage;
    }

    public Employee getTutor() {
        return tutor;
    }

    public void setTutor(Employee tutor) {
        this.tutor = tutor;
    }

    public Institution getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(Institution eventPlace) {
        this.eventPlace = eventPlace;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
