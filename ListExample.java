import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); 

        System.out.println("List of fruits: " + fruits);

        System.out.println("Element at index 1: " + fruits.get(1));

        fruits.remove("Banana");
        System.out.println("List after removing Banana: " + fruits);
        System.out.println("Size of the list: " + fruits.size());
    }
}