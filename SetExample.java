import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Cherry");
        
        boolean isAdded = uniqueFruits.add("Apple");

        System.out.println("Set of fruits: " + uniqueFruits);
        System.out.println("Was the duplicate 'Apple' added? " + isAdded); // false
        System.out.println("Does the set contain 'Banana'? " + uniqueFruits.contains("Banana"));
    }
}