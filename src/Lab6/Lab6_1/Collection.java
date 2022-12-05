package Lab6.Lab6_1;

import Lab3.Employee;

public class Collection {
    private Employee[] employees;

    public Collection(int count){
        employees = new Employee[count];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
