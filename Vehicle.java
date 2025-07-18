public class Vehicle {
    protected String brand = "Ford"; 

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Subclass (Child)
// Save as "Motorbike.java"
public class Motorbike extends Vehicle {
    private String modelName = "Raptor";

    public static void main(String[] args) {
        // Create a Motorbike object
        Motorbike myBike = new Motorbike();

        // Call the honk() method from the Vehicle class
        myBike.honk();

        // Access the brand attribute from the Vehicle class
        System.out.println("Brand: " + myBike.brand);
        System.out.println("Model: " + myBike.modelName);
    }
}