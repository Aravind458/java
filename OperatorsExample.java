public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b)); // Remainder

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a > b: " + (a > b));   // true

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false
    }
}