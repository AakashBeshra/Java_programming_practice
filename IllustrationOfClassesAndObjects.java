// Illustration of Classes and Objects Program 20
import java.util.Scanner;

public class IllustrationOfClassesAndObjects
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.getStdData();
        std.showStdData();
    }
}
class Student
{
    int r_no;
    String name;
    void getStdData()
    {
        System.out.print("Enter Roll number and name: ");
        Scanner sc = new Scanner(System.in);
        r_no = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
    }
    void showStdData()
    {
        System.out.println("Roll number: " + r_no);
        System.out.println("Name: " + name);
    }
}