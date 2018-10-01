public class CountAs {
    public static void main(String[] args) {
        // Create a function that takes a string parameter,
        // counts the occurrences of the letter "a", and returns it as a number.

        // example: on the input "Apple" the function should return 1 - print this result
        // example: on the input "Avocado" the function should return 2 - print this result
        // example: on the input "Blueberry" the function should return 0 - print this result

        System.out.println(howManyAsIn("Apple")); // 1
        System.out.println(howManyAsIn("Avocado")); // 2
        System.out.println(howManyAsIn("Blueberry")); // 0
        System.out.println(howManyAsIn("Green Fox Academy")); // 2

    }

    public static int howManyAsIn(String str) {

        str = str.toLowerCase();

        //from https://stackoverflow.com/a/8910767:
        return str.length() - str.replace("a", "").length();
    }
}