// Write a Java program for implementation of Utility Methods Using Interface
import java.util.Scanner;

// Interface with an abstract add method and a static mul method
interface Utility_Demo {
    int add(int a, int b); // Abstract method
    
    // Static method in interface
    static int mul(int a, int b) {
        return a * b;
    }
}

// Class implementing the interface
class U_Demo implements Utility_Demo {
    // Implementing the add method
    public int add(int a, int b) {
        return a + b;
    }
}

// Main class to illustrate the usage of the methods
public class IllustrationOfUtilityMethodsUsingInterface {
    public static void main(String[] args) {
        int result_1, result_2;
        
        // Creating an object of U_Demo which implements Utility_Demo
        U_Demo obj = new U_Demo();
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // Using the add method
        result_1 = obj.add(num1, num2);
        System.out.println("Add: " + result_1);
        
        // Using the static mul method from the interface
        result_2 = Utility_Demo.mul(num1, num2);
        System.out.println("Multiply: " + result_2);
    }
}
