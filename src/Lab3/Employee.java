package Lab3;

import java.util.Date;

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
}
