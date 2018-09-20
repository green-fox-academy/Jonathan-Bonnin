import java.util.Scanner;

public class FindTheSubstring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input 2 strings, I'll tell you the index of the 2nd one in the 1st");

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println(subStr(str1, str2));
    }


    public static int subStr(String input, String q) {
        return input.indexOf(q);
    }
}
