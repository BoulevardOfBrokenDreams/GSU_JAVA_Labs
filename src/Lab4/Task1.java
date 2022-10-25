package Lab4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append(new Scanner(System.in).nextLine());
        System.out.println(normalizeString(str));

        var array = separationString("hello; world     ", "; ");

        for(var item : array){
            System.out.println(item);
        }

        System.out.println("1000");
    }

    public static String[] separationString(String str, String symbols){
        StringBuilder[] array = new StringBuilder[str.length()];

        int wordNumber = 0;
        for(int i = 0; i < str.length(); i++){
            if(array[wordNumber] == null){
                array[wordNumber] = new StringBuilder();
            }

            if(checkSymbol(str.charAt(i), symbols)){
                wordNumber++;
                continue;
            }
            if(wordNumber > 0 && array[wordNumber - 1].toString().equals("")){
                wordNumber--;
            }

            array[wordNumber].append(str.charAt(i));
        }

        return toStringArray(array);
    }

    private static String[] toStringArray(StringBuilder[] array){
        var list = new ArrayList<String>();
        for (StringBuilder stringBuilder : array) {
            if (stringBuilder != null) {
                list.add(stringBuilder.toString());
            }
        }
        return list.toArray(new String[0]);
    }

    private static boolean checkSymbol(char symbol, String symbols){
        for(int i = 0; i < symbols.length(); i++){
            if(symbol == symbols.charAt(i)){ return true;}
        }
        return false;
    }

    public static String normalizeString(StringBuilder str){

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
