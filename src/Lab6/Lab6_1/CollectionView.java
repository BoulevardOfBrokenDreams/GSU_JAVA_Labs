package Lab6.Lab6_1;

import Lab3.Employee;

public class CollectionView {
    public void printCollection(Employee[] employees) {
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null) {
                System.out.println("Employee ["  + i + "] " + employees[i].toString());
            }
        }
    }
}
