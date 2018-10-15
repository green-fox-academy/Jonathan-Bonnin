import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isAnagram (String word1, String word2){

        if (word1 instanceof String && word2 instanceof String) {

            String[] list1 = word1.replaceAll("[^a-zA-Z]", "").split("");
            String[] list2 = word2.replaceAll("[^a-zA-Z]", "").split("");

            List<String> arrayList1 = new ArrayList<String>();
            List<String> arrayList2 = new ArrayList<String>();

            if (list1.length == list2.length) {
                for (int i = 0; i < list1.length; i++) {

                    arrayList1.add(list1[i].toLowerCase());
                    arrayList2.add(list2[i].toLowerCase());

                }
                Collections.sort(arrayList1);
                Collections.sort(arrayList2);

                if (arrayList1.equals(arrayList2)) {
                    return true;
                }

            }
        } else {
            return false;
        }
        return false;
    }

}
