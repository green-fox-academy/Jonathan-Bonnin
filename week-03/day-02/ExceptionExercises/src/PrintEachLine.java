import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        try {
            read();
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }

    public static void read() throws Exception {
        Path myPath = Paths.get("my-file.txt");
        List<String> myFile = Files.readAllLines(myPath);
        for (String line : myFile) {
            System.out.println(line);
        }
    }
}