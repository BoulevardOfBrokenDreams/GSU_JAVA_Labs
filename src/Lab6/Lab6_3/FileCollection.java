package Lab6.Lab6_3;

import Lab3.Employee;
import Lab6.Lab6_2.Collection;
import Lab6.Lab6_2.CollectionController;
import Lab6.Lab6_2.CollectionView;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCollection extends CollectionController<Employee> {

    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FileCollection(Collection<Employee> employeeCollection, CollectionView<Employee> employeeCollectionView) {
        super(employeeCollection, employeeCollectionView);
    }

    public void createFile(Scanner scanner){
        String fileName = scanner.next();
        try{
            File file = new File("D://Repositories//JAVA//src//Lab6//Lab6_3", fileName);
            if(!file.exists()){
                file.createNewFile();
                this.setFile(fileName);
                System.out.println("File created");
            }else {
                System.out.println("File is already exists");
            }

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void printToFile(){
        try{
            File file = new File("D://Repositories//JAVA//src//Lab6//Lab6_3", this.getFile());

            var collection = super.getTCollection().getCollection();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(collection.length + "\n");

            for(var item : collection){
                fileWriter.append(item.getFirstName());
            }

            fileWriter.close();

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
