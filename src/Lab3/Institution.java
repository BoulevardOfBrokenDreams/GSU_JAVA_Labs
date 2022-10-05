package Lab3;

public class Institution {
    private District dislocation;
    private int number;
    private TypeOfEducation typeOfEducation;
    private int countOfStudents;
    private String director;
    private Employee tutor;
    private String adress;

    public Institution(District dislocation, int number, TypeOfEducation typeOfEducation, int countOfStudents, String director, Employee tutor, String adress) {
        this.dislocation = dislocation;
        this.number = number;
        this.typeOfEducation = typeOfEducation;
        this.countOfStudents = countOfStudents;
        this.director = director;
        this.tutor = tutor;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
