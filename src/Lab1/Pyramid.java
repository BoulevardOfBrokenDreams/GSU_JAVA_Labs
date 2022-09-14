package Lab1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of base: ");
        var baseLength = scanner.nextInt();

        System.out.print("Enter the other side: ");
        var sideLength = scanner.nextInt();

        var pyramidsArea = Math.pow(baseLength, 2) * Math.sqrt(3) / 4 + 1.5 * baseLength
                * Math.sqrt(Math.pow(sideLength, 2) - Math.pow(baseLength, 2) / 4);

        System.out.println("The pyramids area is " + pyramidsArea);
    }
}
