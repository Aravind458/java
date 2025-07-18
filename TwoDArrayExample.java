public class TwoDArrayExample {
    
    public static void main(String[] args) {
        // Declare and initialize a 2D array (3 rows, 4 columns)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Access an element
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 7

        // Loop through the 2D array using nested loops
        System.out.println("\n--- Looping through the matrix ---");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + "\t"); // Print element
            }
            System.out.println(); // New line after each row
        }
    }
}