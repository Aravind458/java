public class StringBasics {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "World";

        // 1. Concatenation
        String message = greeting + ", " + name + "!";
        System.out.println("Concatenated String: " + message);

        // 2. Length
        System.out.println("Length of message: " + message.length());

        // 3. Convert to Upper/Lower Case
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // 4. Find a character's index
        System.out.println("Index of 'World': " + message.indexOf("World"));
    }
}