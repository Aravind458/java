public class StringAdvanced {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "java programming";
        String str3 = "Java Programming";

        // 1. Comparison
        // .equals() is case-sensitive
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        // .equalsIgnoreCase() is not case-sensitive
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true

        // 2. Substring
        // Get a part of the string from index 5 to the end
        String sub = str1.substring(5);
        System.out.println("Substring from index 5: " + sub); // "Programming"

        // 3. Character at a specific index
        char ch = str1.charAt(0);
        System.out.println("Character at index 0: " + ch); // 'J'

        // 4. Replace characters
        String replacedStr = str1.replace("Java", "Python");
        System.out.println("Replaced string: " + replacedStr);
    }
}