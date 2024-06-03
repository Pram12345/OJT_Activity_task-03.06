import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinebyLine {

    public static void main(String[] args) {
        String filePath = "example.txt"; 

        readFileLineByLine(filePath);
    }

    public static void readFileLineByLine(String filePath) {
        BufferedReader bufferedReader = null;
        try {
          
            bufferedReader = new BufferedReader(new FileReader(filePath));

        
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
               
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
