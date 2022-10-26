package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        var array = separationString("hello;. world              i'm an .iron man", "; .");

        for(var item : array){
            System.out.println(item);
        }
    }

    public static String[] separationString(String str, String symbols){
        StringBuilder[] array = new StringBuilder[str.length()];

        int wordNumber = 0;
        for(int i = 0; i < str.length(); i++) {
            if(array[wordNumber] == null){
                array[wordNumber] = new StringBuilder();
            }

            if (checkSymbol(str.charAt(i), symbols)) {
                wordNumber++;
                continue;
            }
            if (wordNumber > 0 && array[wordNumber - 1].toString().equals("")) {
                wordNumber--;
                i--;
                continue;
            }

            array[wordNumber].append(str.charAt(i));
        }

        var result = new ArrayList<String>();

        for (StringBuilder stringBuilder : array) {
            if (stringBuilder != null && !stringBuilder.toString().equals("")) {
                result.add(stringBuilder.toString());
            }
        }

        return result.toArray(String[]::new);
    }

    private static boolean checkSymbol(char symbol, String symbols){
        for(int i = 0; i < symbols.length(); i++){
            if(symbol == symbols.charAt(i)){ return true;}
        }
        return false;
    }
}
