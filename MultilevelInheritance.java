// Write a Java program for Illustration of Multilevel Inheritance
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// First derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Second derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

// Main class to run the program
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy(); // Creating an object of the most derived class

        // Calling methods from all levels of the hierarchy
        myPuppy.eat(); // Method from Animal class
        myPuppy.bark(); // Method from Dog class
        myPuppy.weep(); // Method from Puppy class
    }
}