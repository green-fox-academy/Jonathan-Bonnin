//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

//  Example:
//  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//  should print [5, 9, 12, 24, 34]
//  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//  should print [34, 24, 12, 9, 5]


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    }

    public static String bubble(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {

                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;

                i = 0;
            }
        }
        return Arrays.toString(arr);
    }

    public static String advancedBubble(int[] arr, boolean desc){

        if(desc){
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]) {

                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    i = 0;
                }
            }
            return Arrays.toString(arr);
        } else {
            return bubble(arr);
        }
    }


}
