package Lab3;

import java.util.Date;

public class Healthing {
    private Employee tutor;
    private Institution school;
    private int childsCount;
    private Date startDate;
    private Date endDate;

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
