// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How big should be the side of your 2d array?");

        int side = input.nextInt();

        while (side < 1) {

            System.out.println("Zzzzzz");

            side = input.nextInt();

        }

        int[][] diagonal = new int[side][side];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if(i == j){
                    diagonal[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(diagonal[i]));
        }

    }
}
