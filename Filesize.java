import java.io.File;

public class Filesize {

    public static void main(String[] args) {
        String filePath = "example.txt"; // Path to the file

        getFileSize(filePath);
    }

    public static void getFileSize(String filePath) {
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            
            long bytes = file.length();
            // Convert to kilobytes (1 KB = 1024 Bytes)
            double kilobytes = (double) bytes / 1024;
            // Convert to megabytes (1 MB = 1024 KB)
            // double megabytes = kilobytes / 1024;

            System.out.println("File size in bytes: " + bytes);
            System.out.printf("File size in kilobytes: %.2f\n", kilobytes);
            // System.out.printf("File size in megabytes: %.2f\n", megabytes);
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}
