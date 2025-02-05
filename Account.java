// Illustration of Bank transactions Program 8
import java.util.Scanner;

class Account
{
    public static void main(String args[])
    {
        Account a = new Account();
        a.getBalance();
        a.deposit();
        a.withdraw();
        a.display();
    }
    String name;
    int balance;
    Scanner sc = new Scanner(System.in);
    void getBalance()
    {
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter balance: ");
        balance = sc.nextInt();
    }
    void deposit()
    {
        System.out.println("Enter amount to deposit: ");
        balance = balance + sc.nextInt();
    }
    void withdraw()
    {
        System.out.println("Enter amount to withdraw: ");
        balance = balance - sc.nextInt();
    }
    void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Balance: " +balance);
    }
}