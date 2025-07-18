import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        try {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                long result = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Calculates the factorial of a given non-negative integer.
     * @param n The number to calculate the factorial of.
     * @return The factorial of n.
     */
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}