// Illustration of Exception handling in Java
import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = s.nextInt();
        System.out.println("Enter a number:");
        int b = s.nextInt();

        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        }

        System.out.println("c = " + c);
        s.close();
    }
}
