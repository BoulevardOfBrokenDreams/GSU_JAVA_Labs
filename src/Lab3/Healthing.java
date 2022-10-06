package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Healthing {
    private Employee tutor;
    private Institution school;
    private int childsCount;
    private Date startDate;
    private Date endDate;

    public Healthing(){
        this.tutor = new Employee();
        this.school = new Institution();
        this.childsCount = 0;
        this.startDate = new Date();
        this.endDate = new Date();
    }

    public Healthing(Scanner scanner) throws ParseException {
        this.tutor = new Employee(scanner);
        this.school = new Institution(scanner);
        System.out.println("Enter count of child's:");
        this.childsCount = scanner.nextInt();
        System.out.println("Enter start date in format dd.mm.yyyy:");
        this.startDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
        System.out.println("Enter end date in format dd.mm.yyyy");
        this.endDate = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
    }

    public Healthing(Employee tutor, Institution school, int childsCount, Date startDate, Date endDate) {
        this.tutor = tutor;
        this.school = school;
        this.childsCount = childsCount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Employee getTutor() {
        return tutor;
    }

    public void setTutor(Employee tutor) {
        this.tutor = tutor;
    }

    public Institution getSchool() {
        return school;
    }

    public void setSchool(Institution school) {
        this.school = school;
    }

    public int getChildsCount() {
        return childsCount;
    }

    public void setChildsCount(int childsCount) {
        this.childsCount = childsCount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
