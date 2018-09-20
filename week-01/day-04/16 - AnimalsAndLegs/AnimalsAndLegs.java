//#TODO
//public class AnimalsAndLegs {
//    public static void main(String[] args) {
//        // Write a program that asks for two integers
//        // The first represents the number of chickens the farmer has
//        // The second represents the number of pigs owned by the farmer
//        // It should print how many legs all the animals have
//    }
//}

import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many chickens you have");
        String chickenStr = scanner.nextLine();
        double chickenNum = Double.parseDouble(chickenStr);
        System.out.println("Tell me how many pigs you have");
        String pigStr = scanner.nextLine();
        double pigNum = Double.parseDouble(pigStr);
        System.out.println("There are " + (Math.round(chickenNum * 2) + Math.round(pigNum * 4)) + " legs in your farm");
    }
}
