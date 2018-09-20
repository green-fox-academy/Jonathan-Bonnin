import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sideLength = input.nextInt();
        if (sideLength > 0) {
            for (int i = 1; i <= sideLength; i++) {
                String drawing = "";
                if (i == 1 || i == sideLength){
                    for (int j = 0; j < sideLength; j++) {
                        drawing += "%";
                    }
                    System.out.println(drawing);
                } else {
                    for (int j = 1; j <= sideLength; j++) {
                        if (j == 1 || j == sideLength) {
                            drawing += "%";
                        } else {
                            drawing += " ";
                        }
                    }
                    System.out.println(drawing);
                }
            }

        } else {
            System.out.println("Please give me an integer superior to 0");
        }
    }
}
