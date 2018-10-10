import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = null;
        System.out.println(sum(list));
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
