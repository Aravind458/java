public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println(" Using continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("Odd number: " + i);
        }

        System.out.println("\n Using break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; 
            }
            System.out.println("Number: " + i);
        }
    }
}