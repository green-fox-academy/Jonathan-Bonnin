import java.util.*;

public class Main{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create, I do not understand."

    }

    public static String quoteSwap(ArrayList<String> wrongQuote){

        String correctQuote = "";

        String temp = wrongQuote.get(2);
        wrongQuote.set(2, wrongQuote.get(5));
        wrongQuote.set(5, temp);

        for (int i = 0; i < wrongQuote.size(); i++) {
            correctQuote += wrongQuote.get(i);
            if (i < wrongQuote.size()-1){
                correctQuote += " ";
            }
        }

        return correctQuote;
    }
}