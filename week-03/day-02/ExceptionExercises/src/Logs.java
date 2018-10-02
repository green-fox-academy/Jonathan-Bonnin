import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        Path logPath = Paths.get("log.txt");
        try {
            List<String> logFile = Files.readAllLines(logPath);
            System.out.println(getUniqueIPs(logFile).toString());            ;
            System.out.println(getGETPOSTRatio(logFile));
        } catch (IOException e) {
            System.out.println("There's no log file!");
        }
    }

    public static double getGETPOSTRatio(List<String> logFile) {
        int getCount = 0;
        int postCount = 0;

        for (String log : logFile) {
            if (log.indexOf("GET") > 0) {
                getCount++;
            } else {
                postCount++;
            }
        }
        return getCount/(double)postCount;
    }

    public static List<String> getUniqueIPs(List<String> logFile) {
        List<String> uniqueIPs = new ArrayList<>();

        for (String log : logFile){
            if (uniqueIPs.indexOf(log.substring(27, 39)) < 0){
                uniqueIPs.add(log.substring(27, 39));
            }
        }
        return uniqueIPs;

    }

}