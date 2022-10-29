package Lab4;

public class Task4 {
    public static void main(String[] args) {
        String result = removeAllEntries("is, if, it. check, if, is is. is", 4);
        System.out.println(result);
    }

    public static String removeAllEntries(String str, int count){
        String symbols = "\", :;.";
        var array = Task2.separationString(str, symbols);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            if(entriesCount(array, array[i]) == count){
                continue;
            }
            result.append(new StringBuilder(array[i] + " "));
        }
        return result.toString();
    }

    private static int entriesCount(String[] array, String word){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(word.equals(array[i])){
                count++;
            }
        }
        return count;
    }
}
