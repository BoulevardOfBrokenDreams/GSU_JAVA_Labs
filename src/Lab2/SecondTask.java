package Lab2;

import java.util.*;

public class SecondTask {
    //14 13 12 11 10 9 8 7 15 6 5 4 3 2 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m parameter: ");
        var m = scanner.nextInt();
        System.out.print("Enter n parameter: ");
        var n = scanner.nextInt();
        System.out.print("Enter the array: ");
        var matrix = enterMatrix(m,n);

        printMatrix(matrix);

        var maximalInMatrix = findMax(matrix);
        var lastStringNumber = lastStringWithElement(matrix, maximalInMatrix);

        if(lastStringNumber != -1)
            m -= 1;

        int[][] newMatrix = new int[m][n];
        for(int i = 0, j = 0; i < matrix.length; i++){
            if(i == lastStringNumber){
                continue;
            }
            newMatrix[j] = matrix[i];
            j++;
        }

        System.out.println();
        printMatrix(newMatrix);

        Vector<Integer> vectorB = new Vector<>();

        for (int[] ints : newMatrix) {
            for (int anInt : ints) {
                vectorB.add(anInt);
            }
        }

        Collections.sort(vectorB);
        System.out.println(vectorB);
    }

    public static int lastStringWithElement(int[][] array, int necessaryItem ){
        var stringNumber = -1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == necessaryItem){
                    stringNumber = i;
                }
            }
        }

        return stringNumber;
    }

    public static  int[][] enterMatrix(int firstIndex, int secondIndex){
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[firstIndex][secondIndex];
        for(int i = 0; i < firstIndex; i++){
            for(int j = 0; j < secondIndex; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void printMatrix(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array){
        var maximal = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] > maximal) {
                    maximal = ints[j];
                }
            }
        }

        return maximal;
    }
}
