package Lab10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        System.out.println("3. Является ли заданная строчка верным МАС-адресом?");
        String inputMAC = "aE:dC:cA:56:76:54";
        String MAC = "([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}";
        Pattern pattern = Pattern.compile(MAC);
        Matcher matcher = pattern.matcher(inputMAC);
        System.out.println(inputMAC + ": " +matcher.matches()+"\n");
        inputMAC = "01:23:45:67:89:Az";
        matcher = pattern.matcher(inputMAC);
        System.out.println(inputMAC + ": " +matcher.matches()+"\n");
        inputMAC = "01:32:54:67:89:AB";
        matcher = pattern.matcher(inputMAC);
        System.out.println(inputMAC + ": " +matcher.matches()+"\n");
        inputMAC = "01:33:45:67:89:ab:cd";
        matcher = pattern.matcher(inputMAC);
        System.out.println(inputMAC + ": " +matcher.matches()+"\n");

        
    }
}
