public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues after the catch block.");
    }
}