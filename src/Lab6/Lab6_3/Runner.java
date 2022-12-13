package Lab6.Lab6_3;

import Lab3.Employee;
import Lab6.Lab6_2.Collection;
import Lab6.Lab6_2.CollectionView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws ParseException {
        FileCollection fileCollection = new FileCollection(new Collection<>(new Employee[2]), new CollectionView<>());
        Scanner scanner = new Scanner(System.in);

        var item = new Employee(scanner);
        System.out.println();

    }

    public static int menu(String[] args, Scanner scanner){
        for(int i = 0; i < args.length; i++){
            System.out.println(i + ")" + args[i]);
        }
        System.out.print("Enter menu item: ");
        return scanner.nextInt();
    }
}