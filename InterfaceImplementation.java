// Implementation of interface in Java
interface Animal {
    void makeSound();
}
class Dog implements Animal {

    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
    
        Animal myDog = new Dog();
        Animal myCat = new Cat();

    
        myDog.makeSound();
        myCat.makeSound();
    }
}
