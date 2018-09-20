//#TODO
// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an integer and I'll show you its multiplication table, until 10");
        int num = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + num + " = " + i*num);
        }
    }
}
