//#TODO
// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers one after the other, and I'll give you the biggest one:");
        String num1InStr = scanner.nextLine();
        String num2InStr = scanner.nextLine();
        double num1 = Double.parseDouble(num1InStr);
        double num2 = Double.parseDouble(num2InStr);
        System.out.println("Here's the biggest number: ");
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
