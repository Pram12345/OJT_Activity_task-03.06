import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {

    public static void main(String[] args) {
        String filePath = "example.txt"; 
        readFile(filePath);
    }

    public static void readFile(String filePath) {
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
