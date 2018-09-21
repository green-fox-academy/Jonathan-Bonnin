import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me a number, and I'll tell you if it's an Armstrong Number:");
        int num = input.nextInt();
        System.out.println(isArmstrongNumber(num));

        System.out.println("Here's a list of Armstrong Numbers from 0 to 10 millions, for fun:");
        for (int i = 0; i <= 10000000 ; i++) {
            if(isArmstrongNumber(i) == "Yay, it's an Armstrong Number"){
                System.out.println(i);
            }
        }
    }

    public static String isArmstrongNumber(int num) {

        int numberOfDigits = String.valueOf(num).length();
        String numInStr = Integer.toString(num);
        double result = 0.;
        for (int i = 0; i < numberOfDigits ; i++) {
            double numToPower = Integer.parseInt(String.valueOf(numInStr.charAt(i)));
            result += Math.pow(numToPower, numberOfDigits);
        }

        return (num == result) ? "Yay, it's an Armstrong Number" : "It's not an Armstrong Number";

    }

}
