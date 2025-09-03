package practiceVariable;

public class Car {
    // Instance variables
    String model;
    double price;

    // Static variable (shared by all objects)
    static int carCount = 0;

    // Constructor
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        carCount++; // Increase count whenever a new Car is created
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
        System.out.println("Total Cars Created: " + carCount);
        System.out.println("--------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model 3", 40000);
        car1.displayCar();

        Car car2 = new Car("BMW X5", 60000);
        car2.displayCar();

        Car car3 = new Car("Audi A6", 55000);
        car3.displayCar();

        // Final count
        System.out.println("Final Car Count: " + Car.carCount);
    }
}

