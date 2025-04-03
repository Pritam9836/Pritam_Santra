public class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Constructor to initialize the car's make, model, and year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display the car's details
    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println(); // For better readability between car details
    }

    // Main method to create car objects and call displayInfo
    public static void main(String[] args) {
        // Creating two objects of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Calling the displayInfo method to print details of both cars
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println("Car 2 Details:");
        car2.displayInfo();
    }
}
