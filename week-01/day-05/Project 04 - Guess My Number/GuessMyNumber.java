import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("You'll need to guess a number, from 1 included. \nWhat's the maximum number you'd like to guess?");
        int range = input.nextInt();
        while (range < 2) {
            System.out.println("Haha, wow. Very funny. Try again");
            range = input.nextInt();
        }
        System.out.println("Very well. Now tell me how many attempts you'd like to have?");
        int attemptsLeft = input.nextInt();
        while (attemptsLeft < 1) {
            System.out.println("Please call someone with an IQ over 75 to proceed. How many attempts?");
            attemptsLeft = input.nextInt();
        }
        int  numberToGuess = 1 + rand.nextInt(range);
        System.out.println("We're all set. Please guess a number between 1 and " + range + ". You have " + attemptsLeft + " attempt(s) left:");
        int guess = input.nextInt();
        while (guess != numberToGuess && attemptsLeft > 1) {
            attemptsLeft--;
            if (guess > numberToGuess) {
                System.out.println("Too bad, it's lower, try again. Remaining attempts: " + attemptsLeft);
                guess = input.nextInt();
            } else {
                System.out.println("Nope, it's higher, try again. Remaining attempts: " + attemptsLeft);
                guess = input.nextInt();
            }
        }
        if (guess != numberToGuess) {
            System.out.println("You lost... thank you for playing!");
        } else {
            System.out.println("Congratulations! The number was indeed " + numberToGuess + ".");
        }


    }
}
