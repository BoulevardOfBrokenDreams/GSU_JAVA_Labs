package KR;

import java.util.Scanner;

public class KR3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        var flag = false;
        var len = str.length();
        if(len == 1){
            flag = false;
        }else if (len > 1 && str.charAt(0) == ' ' && str.charAt(len - 1) == ' '){
            flag = true;
        }
        System.out.println(flag);
    }
}
