import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        String filePath = "append.txt"; 
        String textToAppend = "This is the text to append to the file.";

        appendToFile(filePath, textToAppend);
    }

    public static void appendToFile(String filePath, String textToAppend) {
        FileWriter fileWriter = null;
        try {
           
            fileWriter = new FileWriter(filePath, true);

           
            fileWriter.write(textToAppend);

            
            fileWriter.write(System.lineSeparator());

            System.out.println("Text has been appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
              
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
