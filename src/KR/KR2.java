package KR;

public class KR2 {
    public static void main(String[] args) {
        printW(12);

    }

    public static void printW(int count){
        printFirstLevel(count);
        printOtherLevels(count);
        printLastLevel(count);
    }

    private static void printFirstLevel(int count){
        StringBuilder s = new StringBuilder();
        int strLen = count * 3 + count - 3;
        int space = (strLen - 3) / 2;
        s.append("*");
        s.append(addSpace(space));
        s.append("*");
        s.append(addSpace(space));
        s.append("*");
        System.out.println(s);
    }

    private static void printOtherLevels(int count){
        int strLen = count * 3 + count - 3;
        int prev = (strLen - 3)/ 2;
        for(int i = 0;  i < count - 2; i++){
            int space1 = i + 1;
            int temp = prev - 2;
            StringBuilder s = new StringBuilder();
            s.append(addSpace(space1));
            s.append("*");
            s.append(addSpace(temp));
            s.append("*");
            s.append(addSpace(strLen - temp * 2 - 5 - space1 - i));
            s.append("*");
            s.append(addSpace(temp));
            s.append("*");
            System.out.println(s.toString());
            prev = temp;
        }
    }

    private static void printLastLevel(int count){
        int strLen = count * 3 + count - 3;
        int space2 = strLen - 2 - (count  - 1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(addSpace(count - 1));
        stringBuilder.append("*");
        stringBuilder.append(addSpace(strLen - count * 2));
        stringBuilder.append("*");
        System.out.println(stringBuilder.toString());
    }

    private static StringBuilder addSpace(int count){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < count; i++){
            s.append(" ");
        }
        return s;
    }
}
