public class LoopsExample {
    public static void main(String[] args) {
        // for loop
        System.out.println("--- for loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while loop
        System.out.println("\n--- while loop ---");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // do-while loop
        System.out.println("\n--- do-while loop ---");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
}