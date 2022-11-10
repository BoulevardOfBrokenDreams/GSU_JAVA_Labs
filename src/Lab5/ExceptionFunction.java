package Lab5;

import java.util.Scanner;

public class ExceptionFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x, u;

        boolean check = true;
        while(check){
            try{
                System.out.print("Enter a = ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter b = ");
                b = Integer.parseInt(scanner.nextLine());
                if(a > b)
                    throw new IllegalArgumentException("a parameter must be less than b");

                System.out.print("Enter x = ");
                x = Integer.parseInt(scanner.nextLine());
                if(x == 0)
                    throw new IllegalArgumentException("The X parameter can't be equal zero");

                System.out.print("Enter u = ");
                u = Integer.parseInt(scanner.nextLine());
                if(-1 * u * x + 5 <= 0) {
                    throw new IllegalArgumentException("There is a mistake -ux + 5 can't be less or equal zero");
                }

                check = false;
                System.out.println(countFuntion(a, b, x, u));
            }
            catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
    }

    public static double countFuntion(int a, int b, int x, int u){
        if(x == 0)
            throw new IllegalArgumentException("The X parameter can't be equal zero");
        if(a > b)
            throw new IllegalArgumentException("a parameter must be less than b");
        if(-1 * u * x + 5 <= 0){
            throw new IllegalArgumentException("There is a mistake -ux + 5 can't be less or equal zero");
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
