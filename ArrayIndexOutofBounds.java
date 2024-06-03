import java.util.Scanner;

public class ArrayIndexOutofBounds{

    public static void main(String[] args) {
      
        int[] array = {10, 20, 30, 40, 50};

     
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
               
                System.out.print("Enter an index to access (0 to " + (array.length - 1) + "): ");
                int index = scanner.nextInt();

              
                System.out.println("Element at index " + index + " is: " + array[index]);

              
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
               
                System.out.println("Error: Index out of bounds. Please try again.");
            } catch (Exception e) {
          
                System.out.println("Error: Invalid input. Please enter a valid index.");
                scanner.next(); 
        }

        scanner.close();
    }
}
