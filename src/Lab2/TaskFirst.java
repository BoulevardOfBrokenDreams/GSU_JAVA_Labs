package Lab2;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array ");
        var arrayLength = scanner.nextInt();

        while(arrayLength <= 0){
            System.out.print("Enter the length of array ");
            arrayLength = scanner.nextInt();
        }

        System.out.print("Enter the array ");
        var array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the first index ");
        var firstIndex = scanner.nextInt();
        System.out.println("Enter the second index ");
        var secondIndex = scanner.nextInt();


    }
}
