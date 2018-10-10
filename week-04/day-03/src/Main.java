import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {


    }

    public static HashMap<Character, Integer> countLetters(String str){
        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (dictionary.containsKey(str.charAt(i))){
                Integer count = dictionary.get(str.charAt(i)) + 1;
                dictionary.put(str.charAt(i), count);
            }
            else {
                dictionary.put(str.charAt(i), 1);
            }
        }
        return dictionary;
    }

    public static int sum(ArrayList<Integer> list) {
        int result = 0;
        for (int num : list) {
            result += num;
        }
        return result;
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }

}
