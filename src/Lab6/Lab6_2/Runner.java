package Lab6.Lab6_2;

import Lab3.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        var mainMenu = new String[]{"Add element", "Update element", "Delete element", "Print all elements", "Exit"};

        var collectionController = new CollectionController<>(new Collection<>(new Employee[3]), new CollectionView<>());
        Scanner scanner = new Scanner(System.in);
        var menuPosition = menu(mainMenu, scanner);

        while(menuPosition != mainMenu.length - 1){
            try{
                switch (menuPosition){
                    case 0 -> collectionController.addElement(new Employee(scanner));
                    case 1 -> collectionController.updateElement(scanner);
                    case 2 -> collectionController.deleteElement(scanner);
                    case 3 -> collectionController.updateViews();
                    default -> throw new Exception("invalid menu item: " + menuPosition);

                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            menuPosition = menu(mainMenu, scanner);
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