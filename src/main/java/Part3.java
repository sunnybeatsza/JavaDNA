import java.util.Objects;

public class Part3 {
    public static boolean twoOccurrences(String stringa,String stringb){
        String[] splitString = stringb.split(" ");
        if (splitString.length < 2){
            String[] splitString2 = stringb.split("");
            int counter = 0;
            for (String string : splitString2){
                if (string.contains(stringa)){
                    counter += 1;
                }
                if (counter >= 2){
                    return true;
                }
            }
            return false;
        }
        int counter = 0;
        for (String string : splitString){
            if (string.contains(stringa)){
             counter += 1;
            }
            if (counter >= 2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("atg", "ctgtatgta"));
    }
}
