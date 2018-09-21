import java.util.Scanner;

public class Doubling {

    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme an integer, and I'll double it. For free.");
        int baseNum = input.nextInt();
        System.out.println(Doubling(baseNum));
    }

    public static int Doubling(int n){

        return n+n;

    }
}
