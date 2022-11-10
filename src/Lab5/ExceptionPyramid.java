package Lab5;

import java.util.Scanner;

public class ExceptionPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int baseLength, sideLength;

        boolean check = true;
        while (check){
            try{
                System.out.print("Enter length of base: ");
                baseLength = Integer.parseInt(scanner.nextLine());
                if(baseLength < 0)
                    throw new IllegalArgumentException("Base length must be bigger than thero");

                System.out.print("Enter the other side: ");
                sideLength = Integer.parseInt(scanner.nextLine());
                if(sideLength < 0)
                    throw new IllegalArgumentException("Side length must be bigger than zero");

                check = false;
                System.out.println("The pyramids area is " + findPyramidArea(baseLength, sideLength));
            }
            catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }

    }

    public static double findPyramidArea(int baseLength, int sideLength){

        return Math.pow(baseLength, 2) * Math.sqrt(3) / 4 + 1.5 * baseLength
                * Math.sqrt(Math.pow(sideLength, 2) - Math.pow(baseLength, 2) / 4);
    }
}
