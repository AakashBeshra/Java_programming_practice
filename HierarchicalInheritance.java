// Write a Java program for implementation of Hierarchical Inheritance
// Parent class (Superclass)
class Vehicle {
    String type;
    
    // Constructor
    Vehicle(String type) {
        this.type = type;
    }
    
    // Method to display vehicle type
    void displayType() {
        System.out.println("Vehicle type: " + type);
    }
}

// Subclass 1
class TwoWheeler extends Vehicle {
    String model;

    // Constructor
    TwoWheeler(String model) {
        super("Two-Wheeler"); // Call to the parent class constructor
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Subclass 2
class FourWheeler extends Vehicle {
    String model;

    // Constructor
    FourWheeler(String model) {
        super("Four-Wheeler"); // Call to the parent class constructor
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Main class to run the program
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        TwoWheeler bike = new TwoWheeler("Yamaha FZ");
        FourWheeler car = new FourWheeler("Toyota Corolla");

        // Accessing methods from parent and child classes
        bike.displayType(); // Inherited method from Vehicle
        bike.displayModel(); // Method from TwoWheeler

        car.displayType(); // Inherited method from Vehicle
        car.displayModel(); // Method from FourWheeler
    }
}