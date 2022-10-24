package Lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append(new Scanner(System.in).nextLine());
        System.out.println(normalizeString(str));
    }

    private static String normalizeString(StringBuilder str){

        var newStr = new StringBuilder(" ");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' && newStr.charAt(newStr.length() - 1) == ' '){
                continue;
            }
            newStr.append(str.charAt(i));
        }
        return newStr.deleteCharAt(0).toString();
    }
}
