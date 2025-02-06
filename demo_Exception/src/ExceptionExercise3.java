import java.util.Scanner;

// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        String ageInput = scanner.nextLine();
        scanner.close();

        try {
            // Parse the input to an integer and call the checkAge method
            int age = Integer.parseInt(ageInput);
            checkAge(age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (InvalidAgeException e) {
            System.out.println("Age is invalid. Please input again later.");
        } finally {
            System.out.println("Age verification attempt completed.");
        }
    }

    // Method to check age and throw InvalidAgeException if age is less than 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18");
        } else {
            System.out.println("Age " + age + " is accepted.");
        }
    }
}
