// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        System.out.println(calculate());

    }

    public static int calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in the expression in the format {operation} {operand} {operand}:");
        String expression = input.nextLine();
        String[] parameters = expression.split(" ");

        if (parameters.length != 3){
            calculate();
        }

        if (parameters[0].equals("/")) {
            return Integer.parseInt(parameters[1]) / Integer.parseInt(parameters[2]);
        } else if (parameters[0].equals("*")) {
            return Integer.parseInt(parameters[1]) * Integer.parseInt(parameters[2]);
        } else if (parameters[0].equals("-")) {
            return Integer.parseInt(parameters[1]) - Integer.parseInt(parameters[2]);
        } else if (parameters[0].equals("+")) {
            return Integer.parseInt(parameters[1]) + Integer.parseInt(parameters[2]);
        } else if (parameters[0].equals("%")) {
            return Integer.parseInt(parameters[1]) % Integer.parseInt(parameters[2]);
        } else {
            return calculate();
        }
    }
}