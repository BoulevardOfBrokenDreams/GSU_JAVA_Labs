package Lab6.Lab6_3;

import Lab3.Employee;
import Lab6.Lab6_2.Collection;
import Lab6.Lab6_2.CollectionController;
import Lab6.Lab6_2.CollectionView;

import java.io.*;
import java.text.SimpleDateFormat;
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
        System.out.print("Enter filename: ");
        String fileName = scanner.next();
        try{
            File file = new File("D://Repositories//JAVA//src//Lab6//Lab6_3//" + fileName);
            if(!file.exists()){
                file.createNewFile();
                this.setFile("D://Repositories//JAVA//src//Lab6//Lab6_3//" + fileName);
                System.out.println("File created");
            }else {
                System.out.println("File is already exists");
                setFile("D://Repositories//JAVA//src//Lab6//Lab6_3//" + fileName);
            }

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void printToFile() throws IOException {

        var fileWriter = new FileWriter(getFile());

        try{
            var collection = super.getTCollection().getCollection();

            var countNotNullElements = 0;
            for(int i = 0; i < collection.length; i++){
                if(collection[i] != null){
                    countNotNullElements++;
                }
            }
            fileWriter.append(countNotNullElements + "\n");

            for(var item : collection){
                if(item != null){
                    fileWriter.append(item.getFirstName() + "\n");
                    fileWriter.append(item.getLastName() + "\n");
                    fileWriter.append(new SimpleDateFormat("dd.MM.yyyy").format(item.getBirthday()) + "\n");
                    fileWriter.append(item.getPost() + "\n");
                    fileWriter.append(new SimpleDateFormat("dd.MM.yyyy").format(item.getDateOfEmploy()) + "\n");
                    fileWriter.append(new SimpleDateFormat("dd.MM.yyyy").format(item.getDateOfDismiss()) + "\n");
                }
            }
            fileWriter.close();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            fileWriter.close();
        }
    }

    public void readFromFile(){
        try{
            var reader = new BufferedReader(new FileReader(this.getFile()));

            var elementCount = Integer.parseInt(reader.readLine());
            for(int i = 0; i < elementCount; i++){
                var firstName = reader.readLine();
                var lastName = reader.readLine();
                var birthday = new SimpleDateFormat("dd.MM.yyyy").parse(reader.readLine());
                var post = reader.readLine();
                var employDate = new SimpleDateFormat("dd.MM.yyyy").parse(reader.readLine());
                var dismissDate = new SimpleDateFormat("dd.MM.yyyy").parse(reader.readLine());
                this.addElement(new Employee(firstName,lastName, birthday, post, employDate, dismissDate));
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
