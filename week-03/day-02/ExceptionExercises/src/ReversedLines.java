import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decrypt("reversed-lines.txt");
    }

    private static void decrypt(String filePath) {
        Path pathCryptedFile = Paths.get(filePath);
        Path pathCleanFile = Paths.get("decrypted-lines.txt");

        try {
            Files.createFile(pathCleanFile);
        } catch (IOException e) {
            System.out.println("Could not create file...");
        }

        try {
            List<String> cryptedArticle = Files.readAllLines(pathCryptedFile);
            for (String line : cryptedArticle) {
                for (int i = line.length()-1; i >= 0; i--) {
                    Files.write(pathCleanFile, (String.valueOf(line.charAt(i)).getBytes()), StandardOpenOption.APPEND);
                }
                Files.write(pathCleanFile, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            System.out.println("No such file. Boohoohoo");
        }

    }


}