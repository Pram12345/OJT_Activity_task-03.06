import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinebyLine {

    public static void main(String[] args) {
        String filePath = "example.txt"; // Path to the file

        readFileLineByLine(filePath);
    }

    public static void readFileLineByLine(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            // Create a BufferedReader object
            bufferedReader = new BufferedReader(new FileReader(filePath));

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the BufferedReader to release system resources
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
