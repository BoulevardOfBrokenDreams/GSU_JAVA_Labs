package Lab3;

import java.util.Date;

public class Student extends Person{
    private int StudiedAtClass;
    private Institution school;
    private Olympiad participant;

    public Student(String firstName, String lastName, Date birthDay) {
        super(firstName, lastName, birthDay);
    }

    public Student(String firstName, String lastName, Date birthDay, int studiedAtClass, Institution school, Olympiad participant) {
        super(firstName, lastName, birthDay);
        StudiedAtClass = studiedAtClass;
        this.school = school;
        this.participant = participant;
    }

    public int getStudiedAtClass() {
        return StudiedAtClass;
    }

    public void setStudiedAtClass(int studiedAtClass) {
        StudiedAtClass = studiedAtClass;
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
}
