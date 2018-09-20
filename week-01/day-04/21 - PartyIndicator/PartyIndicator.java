// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("So... I heard you're having a party - how many boys will attend?");
        int numOfBoys = input.nextInt();
        System.out.println("Very well. And how many girls will be there?");
        int numOfGirls = input.nextInt();
        System.out.println("Here's the kind of party you're having:");
        if (numOfGirls == 0 && numOfBoys > 0){
            System.out.println("Sausage party");
        } else if ((numOfBoys + numOfGirls) >= 20){
            if (numOfBoys == numOfGirls){
                System.out.println("The party is excellent!");
            } else {
                System.out.println("Quite cool party!");
            }
        } else if ((numOfBoys + numOfGirls) > 0){
            System.out.println("Average party...");
        } else {
            // Added this, because otherwise 0 boys and 0 girls still outputs "Sausage Party")
            System.out.println("There's nobody... can't call that a party");
        }
    }
}
