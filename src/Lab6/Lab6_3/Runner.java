package Lab6.Lab6_3;

import Lab3.Employee;
import Lab6.Lab6_2.Collection;
import Lab6.Lab6_2.CollectionView;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws ParseException, IOException {
        var mainMenu = new String[]{"Create file", "Read from file", "Print to file", "other work with collection", "Exit"};
        FileCollection fileCollection = new FileCollection(new Collection<>(new Employee[2]), new CollectionView<>());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        fileCollection.setFile("D://Repositories//JAVA//src//Lab6//Lab6_3//" + scanner.next());

        var menuPosition = menu(mainMenu, scanner);
        while(menuPosition != mainMenu.length - 1){
            try{
                switch(menuPosition){
                    case 0 -> fileCollection.createFile(scanner);
                    case 1 -> fileCollection.readFromFile();
                    case 2 -> fileCollection.printToFile();
                    case 3 -> collectionWok(fileCollection, scanner);
                    default -> throw new Exception("Invalid menu item: " + menuPosition);
                }
            }catch (Exception exception){
                exception.getMessage();
            }
            menuPosition = menu(mainMenu, scanner);
        }

    }

    public static void collectionWok(FileCollection fileCollection, Scanner scanner){
        var collectionMenu = new String[]{"add element", "Update element", "Delete element", "Print all elements", "Exit"};
        var menuPosition = menu(collectionMenu, scanner);
        while(menuPosition != collectionMenu.length - 1){
            try{
                switch (menuPosition){
                    case 0 -> fileCollection.addElement(new Employee(scanner));
                    case 1 -> fileCollection.updateElement(scanner);
                    case 2 -> fileCollection.deleteElement(scanner);
                    case 3 -> fileCollection.updateViews();
                    default -> throw new Exception("invalid menu item: " + menuPosition);

                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            menuPosition = menu(collectionMenu, scanner);
        }
    }

    public static int menu(String[] args, Scanner scanner){
        for(int i = 0; i < args.length; i++){
            System.out.println(i + ")" + args[i]);
        }
        System.out.print("Enter menu item: ");
        return scanner.nextInt();
    }
}