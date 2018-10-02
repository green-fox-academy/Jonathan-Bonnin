import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decrypt("reversed-order.txt");
    }

    private static void decrypt(String filePath) {
        Path pathCryptedFile = Paths.get(filePath);
        Path pathCleanFile = Paths.get("decrypted-order.txt");

        try {
            Files.createFile(pathCleanFile);
        } catch (IOException e) {
            System.out.println("Could not create file...");
        }

        try {
            List<String> cryptedArticle = Files.readAllLines(pathCryptedFile);
            for (int i = cryptedArticle.size()-1; i >= 0; i--) {
                Files.write(pathCleanFile, cryptedArticle.get(i).getBytes(), StandardOpenOption.APPEND);
                Files.write(pathCleanFile, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            }


        } catch (IOException e) {
            System.out.println("No such file. Boohoohoo");
        }

    }


}