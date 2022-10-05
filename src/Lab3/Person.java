package Lab3;

import java.util.Date;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private Date birthday;

    public Person() {
        firstName = "";
        lastName = "";
        birthday = new Date();
    }

    public Person(String firstName, String lastName, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthday = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BirthDay=" + birthday +
                '}';
    }
}
