package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Checkings {
    private Institution eventPlace;
    private String level;
    private Employee tutor;
    private Date eventDate;
    private String remarks;

    public Checkings(){
        this.eventPlace = new Institution();
        this.level = "";
        this.tutor = new Employee();
        this.eventDate = new Date();
        this.remarks = "";
    }

    public Checkings(Scanner scanner) throws ParseException {
        this.eventPlace = new Institution(scanner);
        System.out.println("Enter level of event:");
        this.level = scanner.nextLine();
        this.tutor = new Employee(scanner);
        System.out.println("Enter date of event in format dd.mm.yyyy");
        this.eventDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
        System.out.println("Enter remarks:");
        this.remarks = scanner.nextLine();
    }

    public Checkings(Institution eventPlace, String level, Employee tutor, Date eventDate, String remarks) {
        this.eventPlace = eventPlace;
        this.level = level;
        this.tutor = tutor;
        this.eventDate = eventDate;
        this.remarks = remarks;
    }

    public Institution getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(Institution eventPlace) {
        this.eventPlace = eventPlace;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Employee getTutor() {
        return tutor;
    }

    public void setTutor(Employee tutor) {
        this.tutor = tutor;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
