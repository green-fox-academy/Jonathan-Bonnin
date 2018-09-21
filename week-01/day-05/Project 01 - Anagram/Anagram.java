import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme 2 strings, I'll tell you if they're an anagram!");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.println(isAnagran(str1, str2));
    }

    public static boolean isAnagran(String str1, String str2){
        // removes all non letters from the 2 strings
        // creates a lower case only string
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str1.length() != str2.length()){
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str2.indexOf(str1.charAt(i)) == -1 ){
                    return false;
                }
                String remove = str1.substring(i, i+1);
                System.out.println(remove);
                str2 = str2.replace(remove, "");
            }

        }
        return true;

    }
}
