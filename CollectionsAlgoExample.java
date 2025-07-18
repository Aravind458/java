import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgoExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original list: " + numbers);

        // 1. Sorting
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // 2. Shuffling
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // 3. Reversing
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // 4. Min and Max
        System.out.println("Min value: " + Collections.min(numbers));
        System.out.println("Max value: " + Collections.max(numbers));
    }
}