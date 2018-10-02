// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CountLines {
    public static void main(String[] args) {

        try {
            System.out.println(howManyLines("this-file-doesnt-exist-hueheheheh.txt"));
        } catch (Exception e) {
            System.out.println(0);
        }
    }

    public static int howManyLines(String file) throws Exception {
        Path myPath = Paths.get(file);
        return Files.readAllLines(myPath).size();
    }
}
