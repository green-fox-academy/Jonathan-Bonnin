import java.util.Arrays;

public class Seconds {

    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the orignal list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

        int[] example = {1, 2, 3, 4, 5};

        System.out.println(returnsSecondElements(example));
    }

    public static String returnsSecondElements(int[] numbers) {
        int[] listOfSecondElems = new int[numbers.length / 2];
        int indexCounter = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            listOfSecondElems[indexCounter] = numbers[i];
            indexCounter++;
        }

        return Arrays.toString(listOfSecondElems);
    }
}
