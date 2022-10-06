package Lab3;

import java.text.ParseException;
import java.util.Scanner;

public class Institution {
    private District dislocation;
    private int number;
    private TypeOfEducation typeOfEducation;
    private int countOfStudents;
    private String director;
    private Employee tutor;
    private String address;

    public Institution(){
        this.dislocation = District.DEFAULT;
        this.number = 0;
        this.typeOfEducation = TypeOfEducation.DEFAULT;
        this.countOfStudents = 0;
        this.director = "";
        this.tutor = new Employee();
        this.address = "";
    }

    public Institution(Scanner scanner) throws ParseException {
        this.dislocation = District.DEFAULT;
        this.dislocation.setTitle(scanner);
        System.out.println("Enter number of institution: ");
        this.number = scanner.nextInt();
        this.typeOfEducation = TypeOfEducation.DEFAULT;
        this.typeOfEducation.setTitle(scanner);
        System.out.println("Enter count of students:");
        this.countOfStudents = scanner.nextInt();
        System.out.println("Enter name of director: ");
        this.director = scanner.nextLine();
        this.tutor = new Employee(scanner);
        System.out.println("Enter the address of in");
    }

    public Institution(District dislocation, int number, TypeOfEducation typeOfEducation, int countOfStudents, String director, Employee tutor, String address) {
        this.dislocation = dislocation;
        this.number = number;
        this.typeOfEducation = typeOfEducation;
        this.countOfStudents = countOfStudents;
        this.director = director;
        this.tutor = tutor;
        this.address = address;
    }

    public District getDislocation() {
        return dislocation;
    }

    public void setDislocation(District dislocation) {
        this.dislocation = dislocation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TypeOfEducation getTypeOfEducation() {
        return typeOfEducation;
    }

    public void setTypeOfEducation(TypeOfEducation typeOfEducation) {
        this.typeOfEducation = typeOfEducation;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Employee getTutor() {
        return tutor;
    }

    public void setTutor(Employee tutor) {
        this.tutor = tutor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
