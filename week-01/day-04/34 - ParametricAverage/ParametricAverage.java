import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'll calculate the sum and average of how many integers you'd like. How many will there be?");
        int qty = input.nextInt();
        if (qty <= 0){
            System.out.println("Okay, whatever");
        } else {
            System.out.println("Cool, gimme dem numbers!");
            int sum = 0;
            double avg = 0;
            for (int i = 1; i <= qty; i++) {
                int num = input.nextInt();
                sum += num;
            }
            double qtyDouble = qty;
            double average = sum/qtyDouble;
            System.out.println("Sum: " + sum + ", Average: " + average);
        }
    }
}
