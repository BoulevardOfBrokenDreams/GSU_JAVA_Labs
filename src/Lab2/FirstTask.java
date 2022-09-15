package Lab2;

import java.util.Scanner;

public class FirstTask {
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
        System.out.print("Enter the second index ");
        var secondIndex = scanner.nextInt();

        while(firstIndex > secondIndex){
            System.out.println("first index should be bigger than second");
            System.out.print("Enter the first index ");
            firstIndex = scanner.nextInt();
            System.out.println("Enter the second index ");
            secondIndex = scanner.nextInt();
        }

        while(firstIndex < arrayLength && secondIndex < arrayLength){
            System.out.println("indexes should be less than array length");
            System.out.print("Enter the first index ");
            firstIndex = scanner.nextInt();
            System.out.println("Enter the second index ");
            secondIndex = scanner.nextInt();
        }

        System.out.print("Enter the p parameter ");
        var p = scanner.nextInt();

        var result = array[firstIndex];
        for(int i = firstIndex + 1; i <= secondIndex && array[i] >= 0; i++){
            result *= array[i];
        }

        if(p % result == 0){
            System.out.println("expression is true");
        }else {
            System.out.println("expression is false");
        }
    }

    public static int[] bSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i] > array[j]){
                    var buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }
}
