package Lab7.FileCollection;

import Lab3.Employee;

import java.io.*;
import java.text.SimpleDateFormat;

public class FileCollection extends CollectionController<Employee> {

    private String file;

    public String getFile() {
        return file;
    }

    public String setFile(String file) {
        this.file = file;
        return "1";
    }

    public FileCollection(Collection<Employee> employeeCollection, CollectionView<Employee> employeeCollectionView) {
        super(employeeCollection, employeeCollectionView);
    }

    public String createFile(String fileName){
        try{
            File file = new File("D://Repositories//JAVA//src//Lab7//" + fileName);
            if(!file.exists()){
                file.createNewFile();
                this.setFile("D://Repositories//JAVA//src//Lab7//" + fileName);
                return "File created";
            }else {
                setFile("D://Repositories//JAVA//src//Lab7//" + fileName);
                return "File is already exists";
            }

        }catch (Exception exception){
            return exception.getMessage();
        }
    }

    public String printToFile() throws IOException {

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
            return exception.getMessage();
        }finally {
            fileWriter.close();
        }
        return "1";
    }

    public String readFromFile(){
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
            return exception.getMessage();
        }
        return "1";
    }
}
