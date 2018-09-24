// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class Main {

    public static void main(String[] args) {

    int[] numList = {3, 4, 5, 6, 7};

        for (int num : numList) {
            num = doubleNum(num);
            System.out.println(num);
        }

    }

    public static int doubleNum(int n){
        return n + n;
    }
}
