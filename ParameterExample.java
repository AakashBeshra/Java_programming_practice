// Java program with parameters Program 9
public class ParameterExample {
    
    // Method with parameters
    public static int addNumbers(int a, int b) {
        int sum = a + b;  // 'a' and 'b' are parameter variables
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        
        // Calling the method and passing arguments
        int result = addNumbers(number1, number2);
        
        // Output the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
