package ibm.com.objects;

// Define a class called Car
class Car {
    // Attributes
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car info
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    // Method to simulate driving
    void drive() {
        System.out.println(brand + " is driving!");
    }
}

// Main class with the main method
public class Application{
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        // Executing object methods
        car1.displayInfo();
        car1.drive();

        car2.displayInfo();
        car2.drive();
    }
}
