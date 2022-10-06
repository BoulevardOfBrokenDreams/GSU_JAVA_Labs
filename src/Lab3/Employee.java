package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Employee extends Person {
    private String post;
    private Date dateOfEmploy;
    private Date dateOfDismiss;

    public Employee() {
        super();
        post = "";
        dateOfEmploy = new Date();
        dateOfDismiss = new Date();
    }

    public Employee(Scanner scanner) throws ParseException {
        System.out.println("Enter first name:");
        setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        setLastName(scanner.nextLine());
        System.out.println("Enter birthday date in format dd.mm.yyyy");
        setBirthday(new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine()));
        System.out.println("Enter post:");
        this.post = scanner.nextLine();
        System.out.println("Enter date of employ in format dd.mm.YYYY:");
        this.dateOfEmploy = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
        System.out.println("Enter date of dismiss in the same format or write NO:");
        var check = scanner.nextLine();
        if(check.equals("NO")) {
            this.dateOfDismiss = new Date();
        }else{
            this.dateOfDismiss = new SimpleDateFormat("dd.MM.yyyy").parse(check);
        }
    }

    public Employee(String firstName, String lastName, Date birthDay, String post, Date dateOfEmploy, Date dateOfDismiss) {
        super(firstName, lastName, birthDay);
        this.post = post;
        this.dateOfEmploy = dateOfEmploy;
        this.dateOfDismiss = dateOfDismiss;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getDateOfEmploy() {
        return dateOfEmploy;
    }

    public void setDateOfEmploy(Date dateOfEmploy) {
        this.dateOfEmploy = dateOfEmploy;
    }

    public Date getDateOfDismiss() {
        return dateOfDismiss;
    }

    public void setDateOfDismiss(Date dateOfDismiss) {
        this.dateOfDismiss = dateOfDismiss;
    }

    @Override
    public void takePartInOlympiad() {
        System.out.println("Employee was tutor of Olympiad");
        System.out.println("And found " + new Random().nextInt() + " intruders");
    }

    @Override
    public void takePartInConference() {
        System.out.println("Employee was tutor of Conference");
    }

    @Override
    public void raising() {
        System.out.println("Salary was raised on " + new Random().nextInt(20, 1000) + "$");
    }
}
