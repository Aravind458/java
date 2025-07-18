import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> customerLine = new LinkedList<>();

        customerLine.add("Alice");
        customerLine.add("Bob");
        customerLine.add("Charlie");

        System.out.println("Current line: " + customerLine);

        System.out.println("Next in line: " + customerLine.peek());

        String servedCustomer = customerLine.poll();
        System.out.println("Serving: " + servedCustomer);
        System.out.println("Updated line: " + customerLine);
    }
}