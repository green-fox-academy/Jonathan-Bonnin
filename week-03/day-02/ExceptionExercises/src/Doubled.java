import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decrypt("duplicated-chars.txt");
    }

    private static void decrypt(String filePath) {
        Path pathCryptedFile = Paths.get(filePath);
        Path pathCleanFile = Paths.get("decrypted-article.txt");

        try {
            Files.createFile(pathCleanFile);
        } catch (IOException e) {
            System.out.println("Could not create file...");
        }

        try {
            List<String> cryptedArticle = Files.readAllLines(pathCryptedFile);
            for (String line : cryptedArticle) {
                for (int i = 0; i < line.length(); i += 2) {
                    Files.write(pathCleanFile, (String.valueOf(line.charAt(i)).getBytes()), StandardOpenOption.APPEND);
                }
                Files.write(pathCleanFile, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            System.out.println("No such file. Boohoohoo");
        }

    }


}