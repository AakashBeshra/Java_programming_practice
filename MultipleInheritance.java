// Write a Java program for illustration of multiple inheritance
// First Interface
interface Animal {
    void sound();  // Abstract method
}

// Second Interface
interface Pet {
    void petName();  // Abstract method
}

// Class implementing both interfaces (Multiple Inheritance)
class Dog implements Animal, Pet {
    // Overriding sound() method from Animal interface
    public void sound() {
        System.out.println("Dog barks");
    }

    // Overriding petName() method from Pet interface
    public void petName() {
        System.out.println("This pet's name is Bruno");
    }
}

// Main class to demonstrate multiple inheritance
class MultipleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create an instance of Dog

        // Call methods from both interfaces
        myDog.sound();    // Calls the sound method from Animal interface
        myDog.petName();  // Calls the petName method from Pet interface
    }
}
