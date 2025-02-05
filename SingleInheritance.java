// Write a Java program for implementation of Single Inheritance
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the program
public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an object of the subclass
        myDog.eat(); // Calling method from superclass
        myDog.bark(); // Calling method from subclass
    }
}