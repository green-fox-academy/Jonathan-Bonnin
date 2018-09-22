import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println("Yo dog, gimme a string and I'll give you all of its palindromes");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int palindromeCounter = 0;

        //looping through every possible sub string to count palindromes

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=  str.length(); j++) {
                String subStr = str.substring(i, j);
                if (subStr.length() > 2 && isPalindrome(subStr) == true) {
                    palindromeCounter++;
                }
            }
        }

        System.out.println("Our hard working team found " + palindromeCounter + " palindromes...");

        //creates an array with as many elements as palindromes

        String[] arrayOfPalindromes = new String[palindromeCounter];
        int arrayIndex = 0;

        //re-loops through every possible sub string to add palindromes to array

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=  str.length(); j++) {
                String subStr = str.substring(i, j);
                if (subStr.length() > 2 && isPalindrome(subStr) == true) {

                    //the first palindrome found is added at index 0 using the value arrayIndex

                    arrayOfPalindromes[arrayIndex] = "\"" + subStr + "\"";

                    //increments arrayIndex in order to add the next palindrome at the next index

                    arrayIndex++;
                }
            }
        }

        System.out.println(Arrays.toString(arrayOfPalindromes));

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
