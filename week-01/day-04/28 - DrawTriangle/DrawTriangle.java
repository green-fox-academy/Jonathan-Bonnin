//#TODO
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me an integer, and I'll draw a triangle with as many lines...");
        int lines = input.nextInt();
        String triangleLine = "*";
        for (int i = 0; i < lines; i++) {
            System.out.println(triangleLine);
            triangleLine += "*";
        }
    }
}
