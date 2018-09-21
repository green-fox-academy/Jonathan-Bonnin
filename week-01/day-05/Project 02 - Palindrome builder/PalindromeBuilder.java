import java.util.Scanner;

public class PalindromeBuilder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme one string, and you'll a palindrome from it");
        String str = input.nextLine();
        System.out.println(palindromeBuilder(str));
    }

    public static String palindromeBuilder(String str) {

        String revsersedStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            revsersedStr += str.charAt(i);
        }
        
        return str+revsersedStr;
    }
}
