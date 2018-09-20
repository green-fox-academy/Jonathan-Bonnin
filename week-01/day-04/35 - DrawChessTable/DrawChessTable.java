import java.util.Scanner;

public class DrawChessTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello beautiful human, let me draw you a useless chess table. How big should be its side?");
        int side = input.nextInt();

        if (side <1) {
            System.out.println("I changed my mind. You're not beautiful");
        } else {
            String table = "";
            for (int i = 1; i <= side ; i++) {
                for (int j = 1; j <= side; j++) {
                    if ((i + j) % 2 == 0){
                        table += "%";
                    } else {
                        table += " ";
                    }
                }
                table += "\n";
            }
            System.out.println(table);
        }
    }
}