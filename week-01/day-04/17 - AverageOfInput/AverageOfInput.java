import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me 5 integers and I'll give you their sum and average: ");
        for (int i = 0; i < 5; i++) {
            String numInStr = scanner.nextLine();
            int num = Integer.parseInt(numInStr);
            sum += num;
            }
        avg = sum / 5.0;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
