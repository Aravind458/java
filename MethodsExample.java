public class MethodsExample {

    public static void main(String[] args) {
        greetUser("Alice", 30);
        greetUser("Bob", 25);

        int sum = addNumbers(10, 20);
        System.out.println("The sum is: " + sum);
    }

    public static void greetUser(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}