// Save as "Dog.java"
public class Dog {
    // Private variables - hidden from other classes (Encapsulation)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        }
    }

    // Method
    public void bark() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Save as "DogPark.java"
public class DogPark {
    public static void main(String[] args) {
        // Create an object (instance) of the Dog class
        Dog myDog = new Dog();

        // Use setter methods to set the values of the private variables
        myDog.setName("Buddy");
        myDog.setAge(3);

        // Use getter methods to retrieve the values
        System.out.println("Dog's Name: " + myDog.getName());
        System.out.println("Dog's Age: " + myDog.getAge());

        // Call a method on the object
        myDog.bark();
    }
}