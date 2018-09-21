import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many soliders do we have in total?");
        int particpants = input.nextInt();
        System.out.println("You should be in position number... " + Math.round(whereShouldYouSeat(particpants)));
    }

    public static double whereShouldYouSeat(int participants){

        double power = 0;
        double participants2 = participants;
        while (Math.pow(2, power) <= participants2){
            power++;
        }

        return (participants2 - Math.pow(2, power-1)) * 2 + 1;

    }
}
