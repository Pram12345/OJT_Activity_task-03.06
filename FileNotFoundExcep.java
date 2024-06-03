import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExcep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the file to read: ");
        String filePath = scanner.nextLine();

        BufferedReader bufferedReader = null;

        try {
         
            bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
          
            System.out.println("Error: The specified file was not found.");
        } catch (IOException e) {
            
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {
            try {
              
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: An I/O error occurred while closing the file.");
            }
        }

     
        scanner.close();
    }
}
