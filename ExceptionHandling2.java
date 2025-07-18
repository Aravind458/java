class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message); 
    }
}

public class ExceptionHandling2 {
    public static void checkAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeValidationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("The 'try-catch' is finished. The finally block is executing.");
        }
    }
}