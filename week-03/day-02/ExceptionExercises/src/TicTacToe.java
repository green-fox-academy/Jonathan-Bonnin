import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    private static String ticTacResult(String filePath) {
        Path myPath = Paths.get(filePath);
        try {
            List<String> game = Files.readAllLines(myPath);
            //checks horizontal lines
            for (String horizontalLine : game) {
                if (horizontalLine.charAt(0) == horizontalLine.charAt(1) &&
                        horizontalLine.charAt(0) == horizontalLine.charAt(2)) {
                    return horizontalLine.substring(2);
                }
            }
            //checks vertical lines
            for (int i = 0; i < 3; i++) {
                if (game.get(0).charAt(i) == game.get(1).charAt(i) &&
                        game.get(0).charAt(i) == game.get(2).charAt(i)) {
                    return String.valueOf(game.get(0).charAt(i));
                }
            }

            //checks diagonals
            if (game.get(0).charAt(0) == game.get(1).charAt(1) &&
                    game.get(0).charAt(0) == game.get(2).charAt(2) ||
                    game.get(0).charAt(2) == game.get(1).charAt(1) &&
                            game.get(0).charAt(2) == game.get(2).charAt(0)) {
                return String.valueOf(game.get(1).charAt(1));
            }
        } catch (IOException e) {
            System.out.println("No file found :(");
        }

        return "draw";
    }
}