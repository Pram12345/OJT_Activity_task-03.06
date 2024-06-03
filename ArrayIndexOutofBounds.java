import java.util.Scanner;

public class ArrayIndexOutofBounds{

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {10, 20, 30, 40, 50};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prompt the user to enter an index
                System.out.print("Enter an index to access (0 to " + (array.length - 1) + "): ");
                int index = scanner.nextInt();

                // Access the array element at the given index
                System.out.println("Element at index " + index + " is: " + array[index]);

                // Break the loop if access is successful
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the exception if the index is out of bounds
                System.out.println("Error: Index out of bounds. Please try again.");
            } catch (Exception e) {
                // Handle any other exceptions
                System.out.println("Error: Invalid input. Please enter a valid index.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }
}
