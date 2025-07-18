public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Element at index 2: " + numbers[2]); 

        numbers[0] = 15;
        System.out.println("New element at index 0: " + numbers[0]);

        System.out.println("Array length: " + numbers.length);

        System.out.println("\n--- Looping through the array ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}