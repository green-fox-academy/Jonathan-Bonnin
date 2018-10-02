import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        Path filePath = Paths.get("my-file.txt");
        try {
            Files.write(filePath, "Jonathan".getBytes());
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }


    }
}