// Write a Java program for Function Overriding
// Superclass
class Animal {
    // Method in superclass
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding the sound method in Dog class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding the sound method in Cat class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate method overriding
class FunctionOverriding {
    public static void main(String[] args) {
        // Create an object of the superclass (Animal) and subclass (Dog)
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Polymorphism: reference is of type Animal but object is of type Dog
        Animal myCat = new Cat();  // Polymorphism: reference is of type Animal but object is of type Cat

        // Call the overridden methods
        myAnimal.sound();  // Calls Animal class method
        myDog.sound();     // Calls Dog class method
        myCat.sound();     // Calls Cat class method
    }
}