//#TODO
//public class MileToKmConverter {
//    public static void main(String[] args) {
//        // Write a program that asks for an integer that is a distance in kilometers,
//        // then it converts that value to miles and prints it
//    }
//}


import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a distance in km, and I'll covert it for you in miles:");
        String kmStr = scanner.nextLine();
        double km = Double.parseDouble(kmStr);
        System.out.println(km/1.609344);
    }
}

