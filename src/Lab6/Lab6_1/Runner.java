package Lab6.Lab6_1;

import Lab3.Employee;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String[] mainMenu = new String[]{"add element", "edit element(by index)", "delete element(by index)", "output all elements", "exit"};
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter collection size: ");
            n = scanner.nextInt();
        } while (n <= 0);
        CollectionController collectionController = new CollectionController(new Collection(n), new CollectionView());
        int menuPosition = menu(mainMenu, scanner);
        while (menuPosition != mainMenu.length - 1) {
            try {
                switch (menuPosition) {
                    case 0 -> collectionController.addElement(new Employee(scanner));
                    case 1 -> collectionController.updateElement(scanner);
                    case 2 -> collectionController.deleteElement(scanner);
                    case 3 -> collectionController.updateViews();
                    default -> throw new Exception("invalid menu item: " + menuPosition);
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            menuPosition = menu(mainMenu, scanner);
        }
    }
    public static int menu(String[] menuOptions, Scanner scanner) {
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(i + ")" + menuOptions[i]);
        }
        System.out.print("Enter menu item: ");
        return scanner.nextInt();
    }
}
