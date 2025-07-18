public class Car {
    String model;
    int year;
    // Constructor with parameters
    public Car(String modelName, int modelYear) {
        System.out.println("Constructor called!");
        model = modelName;
        year = modelYear;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ford Mustang", 2022);

        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}