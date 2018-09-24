// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Main {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};

        for (int i = 0; i < aj.length/2; i++) {
            int temp = aj[aj.length - 1 - i];
            aj[aj.length - 1 - i] = aj[i];
            aj[i] = temp;
        }

        for (int num : aj) {
            System.out.println(num);
        }
    }
}
