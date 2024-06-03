import java.util.Scanner;



class InvalidAgeException extends Exception {
    private int invalidAge;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.invalidAge = age;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}


 public class AgeNotValid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Valid age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid age provided: " + e.getInvalidAge());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}
