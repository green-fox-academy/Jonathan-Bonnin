import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CopyFile {
    public static void main(String[] args) {

        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        copy("copy-that.txt", "copy-there.txt");


    }

    public static boolean copy(String file1, String file2) {
        Path filePath1 = Paths.get(file1);
        Path filePath2 = Paths.get(file2);


        try {
            Files.copy(filePath1, filePath2);
            return true;
        } catch (IOException e) {
            return false;
        }

    }
}