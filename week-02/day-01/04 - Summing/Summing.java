// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

// Note from student: I'm assuming that "all the numbers" start at 0

import java.util.Scanner;

public class Summing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number, and I'll give you the sum of all numbers between 0 and this number");

        int a = input.nextInt();

        while (a < 0){

            System.out.println("Please enter a positive number");

            a = input.nextInt();

        }

        System.out.println("The sum of numbers between 0 and " + a + " is: " + sumUntil(a));
    }

    public static int sumUntil(int num){

        int sum = 0;

        for (int i = 0; i <= num; i++) {

            sum += i;

        }

        return sum;
    }
}
