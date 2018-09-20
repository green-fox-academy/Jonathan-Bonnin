import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        System.out.println("Hello, try to guess the number I'm thinking about, it's between 1 and 100:");
        int guess = input.nextInt();
        while (n != guess){
            if (n > guess){
                System.out.println("The stored number is higher, guess again:");
                guess = input.nextInt();
            } else {
                System.out.println("The stored number is lower, guess again:");
                guess = input.nextInt();
            }
        }
        System.out.println("You found the number: " + n);
    }
}
