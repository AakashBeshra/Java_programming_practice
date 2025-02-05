// Palindrome Program 6
// Write a Java program to check whether a given number is palindrome or not
import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev)
        {
            System.out.println(temp + " is a palindrome number.");
        }
        else
        {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}