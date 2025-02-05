// Prime Number Program 5
// Write a Java program to print prime numbers up to a given range
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Prime numbers up to " + num + " are: ");
        for(int i = 2; i <= num; i++)
        {
            boolean isPrime = true;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }
}