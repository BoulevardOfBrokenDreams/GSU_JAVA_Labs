package Lab7.FileCollection;
import Lab3.*;
import Lab7.Menu;

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
            tCollection.setCollection(collection);
        }
    }

    public void deleteElement(int index){

        var collection = tCollection.getCollection();

        try{
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

    public String updateElement(T item, int index){
        var collection = tCollection.getCollection();
        try{
            collection[index] = item;
        } catch (Exception exception){
            return exception.getMessage();
        }
        return "1";
    }

    public void updateViews(){
        tCollectionView.PrintCollection(tCollection);
    }

    private String getType(T element){
        return element.getClass().toString().split("\\.")
                [element.getClass().toString().split("\\.").length - 1];
    }

}
