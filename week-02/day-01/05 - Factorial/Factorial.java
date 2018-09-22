import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        while (num < 0) {

            System.out.println("The factorial function is only defined for positive numbers!");
            num = input.nextInt();

        }

        System.out.println(factorial(num));
    }

    public static int factorial(int j){

        int result = 1;

        for (int i = j; i >= 1 ; i--) {
            result *= i;
        }

        return  result;
    }
}
