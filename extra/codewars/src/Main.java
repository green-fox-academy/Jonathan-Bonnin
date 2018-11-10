public class Main {

    public static void main(String[] args) {
        //https://www.codewars.com/kata/create-phone-number/train/java
        int[] tenNums = {1, 0, 4, 7, 2, 5, 8, 3, 6, 9};
        System.out.println("\nCreate phone number;");
        System.out.println(Kata.createPhoneNumber(tenNums));
        System.out.println(Kata.createPhoneNumberSolution(tenNums));


        //https://www.codewars.com/kata/534ea96ebb17181947000ada/train/
        System.out.println("\nBreak chocolate;");
        System.out.println(Kata.breakChocolate(4, 10));

        //https://www.codewars.com/kata/disemvowel-trolls/train/java
        System.out.println("\nRemove vowels;");
        System.out.println(Kata.disemvowel("Michel"));
        System.out.println(Kata.disemvowelSolution("Hello, World!"));

        //https://www.codewars.com/kata/dont-give-me-five/train/java
        System.out.println("\nDon't give me five;");
        System.out.println(Kata.dontGiveMeFive(4, 12));
        System.out.println(Kata.dontGiveMeFiveSolution(4, 12));
    }
}
