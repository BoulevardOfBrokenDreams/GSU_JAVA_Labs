package Lab5;

import java.util.Scanner;

public class ExceptionFunction {
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

        try{
            System.out.println(countFuntion(a, b, x, u));
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }


    public static double countFuntion(int a, int b, int x, int u){
        if(x == 0)
            throw new IllegalArgumentException("The X parameter can't be equal zero");
        if(a > b)
            throw new IllegalArgumentException("a parameter can't be less than b");
        if(-1 * u * x + 5 <= 0){
            throw new IllegalArgumentException("There is a mistake -ux + 5 can't be zero");
        }
        if(x < a){
            return Math.cos(x + Math.log(x)) + Math.pow(Math.E, x);
        }else if(x <= b){
            return Math.pow(x, 3) + Math.pow(x, 2) - 15;
        }else{
            return Math.log(-1 * u * x + 5);
        }
    }

}
