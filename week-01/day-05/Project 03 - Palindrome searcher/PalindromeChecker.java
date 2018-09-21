import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println("Yo dog, gimme a string and I'll give you all of its palindromes");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //System.out.println(Arrays.toString(palindromeSearcher(stringToCheck)));
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=  str.length(); j++) {
                String subStr = str.substring(i, j);
                if (subStr.length() > 2 && isPalindrome(subStr) == true) {
                    System.out.println(subStr);
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        int ind1 = 0;
        int ind2 = str.length()-1;
        while (ind2 > ind1){
            if (str.charAt(ind1) != str.charAt(ind2)){
                return false;
            }
            ind1++;
            ind2--;
        }
        return true;
    }

}
