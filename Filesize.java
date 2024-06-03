import java.io.File;

public class Filesize {

    public static void main(String[] args) {
        String filePath = "example.txt"; 

        getFileSize(filePath);
    }

    public static void getFileSize(String filePath) {
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            
            long bytes = file.length();
            
            double kilobytes = (double) bytes / 1024;
         

            System.out.println("File size in bytes: " + bytes);
            System.out.printf("File size in kilobytes: %.2f\n", kilobytes);
          
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}
