// Fibonacci_series Program 4
// Write a Java program to print the fibonacci series
import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < num; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}