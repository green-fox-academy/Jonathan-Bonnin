// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        try {
            writeSomeWordManyTimes("repetitive-file.txt", "Patrik", 999);
        } catch (Exception e) {
            System.out.println("Your file wasn't found");
        }

    }

    public static void writeSomeWordManyTimes(String path, String word, int numOfLines) throws Exception{
        Path filePath = Paths.get(path);

        for (int i = 0; i < numOfLines; i++) {
            Files.write(filePath, (word + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        }
    }
}