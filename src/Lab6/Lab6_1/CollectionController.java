package Lab6.Lab6_1;

import Lab3.Employee;

import java.text.ParseException;
import java.util.Scanner;

public record CollectionController(Collection collection, CollectionView collectionView) {
    public void addElement(Employee employee){
        Employee[] employees = collection.getEmployees();
        for(int i = 0; i < employees.length; i++){
            if(employees[i] == null){
                employees[i] = employee;
                collection.setEmployees(employees);
                System.out.println("Element added");
                break;
            }
        }
        int counter = 0;
        for(var item : employees){
            if(item != null){
                counter++;
            }
        }
        if(employees.length == counter){
            Employee[] newColl = new Employee[employees.length * 2];
            for(int i = 0; i < employees.length; i++){
                newColl[i] = employees[i];
            }
            collection.setEmployees(newColl);
        }
    }

    public void deleteElement(Scanner scanner){
        System.out.print("Enter index of element: ");
        Employee[] employees = collection.getEmployees();

        try{
            int index = Integer.parseInt(scanner.next());
            employees[index] = null;
            for(int i = index; i < employees.length - 1; i++){
                employees[i] = employees[i + 1];
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        collection.setEmployees(employees);
    }

    public void updateElement(Scanner scanner){
        System.out.print("Enter index of element: ");
        Employee[] employees = collection().getEmployees();
        try{
            int index = Integer.parseInt(scanner.next());
            employees[index] = new Employee(scanner);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        collection.setEmployees(employees);
    }

    public void updateViews(){
        collectionView.printCollection(collection().getEmployees());
    }
}
