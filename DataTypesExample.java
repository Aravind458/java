public class DataTypesExample {
    public static void main(String[] args) {
        int myInt = 10;                
        double myDouble = 9.78;        
        char myChar = 'A';             
        boolean myBoolean = true;
        String myString = "Hello Java"; 

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        // --- Typecasting ---
        // Implicit casting (int to double)
        double wideDouble = myInt;
        System.out.println("\nImplicit cast (int to double): " + wideDouble);

        // Explicit casting (double to int)
        int narrowInt = (int) myDouble;
        System.out.println("Explicit cast (double to int): " + narrowInt);
    }
}