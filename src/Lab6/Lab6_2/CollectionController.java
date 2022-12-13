package Lab6.Lab6_2;
import Lab3.*;

import java.util.Arrays;
import java.util.Scanner;


public class CollectionController<T>{

    protected Collection<T> tCollection;
    protected CollectionView<T> tCollectionView;

    public CollectionController(Collection<T> tCollection, CollectionView<T> tCollectionView) {
        this.tCollection = tCollection;
        this.tCollectionView = tCollectionView;
    }

    public Collection<T> getTCollection() {
        return tCollection;
    }

    public void settCollection(Collection<T> tCollection) {
        this.tCollection = tCollection;
    }

    public void addElement(T element){
        var collection = tCollection.getCollection();
        for(int i = 0; i < collection.length; i++){
            if(collection[i] == null){
                collection[i] = element;
                tCollection.setCollection(collection);
                System.out.println("Element added");
                break;
            }
        }

        int counter = 0;
        for(var item : collection){
            if(item != null){
                counter++;
            }
        }
        if(collection.length == counter){
            collection = Arrays.copyOf(collection, collection.length * 2);
            collection[collection.length / 2] = element;
            tCollection.setCollection(collection);
        }
    }

    public void deleteElement(Scanner scanner){
        System.out.print("Enter index of element: ");
        var collection = tCollection.getCollection();

        try{
            var index = Integer.parseInt(scanner.next());
            if(index < 0 || index >= collection.length) {
                throw new ArrayIndexOutOfBoundsException("Entered incorrect index");
            }
            collection[index] = null;
            for (int i = index; i < collection.length - 1; i++){
                collection[i] = collection[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void updateElement(Scanner scanner){
        System.out.println("Enter index of element: ");
        var collection = tCollection.getCollection();

        try{
            int index = Integer.parseInt(scanner.next());
            if(index < 0 || index >= collection.length) {
                throw new ArrayIndexOutOfBoundsException("Entered incorrect index");
            }

            collection[index] = (T)switch (getType(collection[index])){
                case "Employee" -> new Employee(scanner);
                case "Checkings" -> new Checkings(scanner);
                case "Healthing" -> new Healthing(scanner);
                case "Institution" -> new Institution(scanner);
                case "Olympiad" -> new Olympiad(scanner);
                case "Student" -> new Student(scanner);
                default -> null;
            };
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void updateViews(){
        tCollectionView.PrintCollection(tCollection);
    }

    private String getType(T element){
        return element.getClass().toString().split("\\.")
                [element.getClass().toString().split("\\.").length - 1];
    }

}
