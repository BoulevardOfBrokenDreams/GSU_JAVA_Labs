package Lab1;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x = ");
        var x = scanner.nextInt();
        System.out.print("Enter a = ");
        var a = scanner.nextInt();
        System.out.print("Enter b = ");
        var b = scanner.nextInt();
        System.out.print("Enter u = ");
        var u = scanner.nextInt();

        while(x == 0){
            System.out.println("The X parameter can't be zero");
            System.out.print("Enter x = ");
            x = scanner.nextInt();
        }
        while (a > b){
            System.out.println("a parameter can't be less than b");
            System.out.print("Enter a = ");
            a = scanner.nextInt();

            System.out.print("Enter b = ");
            b = scanner.nextInt();
        }

        if(-1 * u * x + 5 <= 0){
            System.out.println("There is a mistake -ux + 5 can't be zero");
            return;
        }

        if(x < a){
            System.out.println(Math.cos(x + Math.log(x)) + Math.pow(Math.E, x));
        }else if(x <= b){
            System.out.println(Math.pow(x, 3) + Math.pow(x, 2) - 15);
        }else{
            System.out.println(Math.log(-1 * u * x + 5));
        }
    }
}//bkbdfkbndfkjbn
