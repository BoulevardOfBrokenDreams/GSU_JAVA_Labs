package Lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Student extends Person  {
    private int studiedAtClass;
    private Institution school;
    private Olympiad participant;

    public Student() {
        super("", "", new Date());
        this.studiedAtClass = 0;
        this.school = new Institution();
        this.participant = new Olympiad();
    }

    public Student(Scanner scanner) throws ParseException {
        System.out.println("Enter first name:");
        setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        setLastName(scanner.nextLine());
        System.out.println("Enter birthday date in format dd.mm.yyyy:");
        setBirthday(new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine()));
        System.out.println("Enter in which class studying student:");
        this.studiedAtClass = scanner.nextInt();
        this.school = new Institution(scanner);
        this.participant = new Olympiad(scanner);
    }

    public Student(String firstName, String lastName, Date birthDay, int studiedAtClass, Institution school, Olympiad participant) {
        super(firstName, lastName, birthDay);
        this.studiedAtClass = studiedAtClass;
        this.school = school;
        this.participant = participant;
    }

    public int getStudiedAtClass() {
        return studiedAtClass;
    }

    public void setStudiedAtClass(int studiedAtClass) {
        this.studiedAtClass = studiedAtClass;
    }

    public Institution getSchool() {
        return school;
    }

    public void setSchool(Institution school) {
        this.school = school;
    }

    public Olympiad getParticipant() {
        return participant;
    }

    public void setParticipant(Olympiad participant) {
        this.participant = participant;
    }

    @Override
    public void takePartInOlympiad() {
        System.out.println("Student " + this.getFirstName() + this.getLastName() + " took part in Olympiad");
        System.out.println("And get " + new Random().nextInt(1, 10) + " place");
    }

    @Override
    public void takePartInConference() {
        System.out.println("Enter theme of conference:");
        var theme = new Scanner(System.in).nextLine();
        System.out.println("Student " + this.getFirstName() + this.getLastName() + " took part in Conference");
        System.out.println("And read report on theme " + theme);
    }

    @Override
    public void raising() {
        this.studiedAtClass += 1;
        System.out.println("Student moved on next class/course");
    }
}
