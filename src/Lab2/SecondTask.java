package Lab2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m parameter: ");
        var m = scanner.nextInt();
        System.out.print("Enter n parameter: ");
        var n = scanner.nextInt();
        System.out.print("Enter the array: ");
        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        printMatrix(array);

        System.out.println(findMax(array));
    }

    public static void printMatrix(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int findMax(int[][] array){

        var maximal = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] > maximal){
                    maximal = array[i][j];
                }
            }
        }
        return maximal;
    }
}
