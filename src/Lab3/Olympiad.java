package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Olympiad {
    private Employee tutor;
    private Institution eventPlace;
    private Subject subject;
    private Date eventDate;
    private int stage;

    public Olympiad(){
        this.tutor = new Employee();
        this.eventPlace = new Institution();
        this.subject = Subject.DEFAULT;
        this.eventDate = new Date();
        this.stage = 0;
    }

    public Olympiad(Scanner scanner) throws ParseException {
        this.tutor = new Employee(scanner);
        this.eventPlace = new Institution(scanner);
        this.subject.setTitle(scanner);
        System.out.println("Enter event date:");
        this.eventDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
        System.out.println("Enter stage:");
        this.stage = scanner.nextInt();
    }

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
