import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        
        File a = new File ("abc.txt");
        if(a.exists()){
            a.delete();
            System.out.println("file deleted successfully");

        }
        else{
            System.out.println("file not deleted");
        }

    }
}
