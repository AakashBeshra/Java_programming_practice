// Illustration of Single Inheritance

import java.util.Scanner;

class Student
{
    protected int rno;
    protected String name;
    Scanner s = new Scanner(System.in);
    void getRno()
    {
        System.out.println("Enter Roll number");
        rno = s.nextInt();
    }
    void getName()
    {
        System.out.println("Enter name of the student");
        name = s.nextLine();
    }
    void putRno()
    {
        System.out.println("Roll No: "+rno);
    }
    void putName()
    {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.getRno();
        obj.getName();
        obj.putRno();
        obj.putName();
        
    }
}// class
class Test extends Student {
    int sub1, sub2, total;
    void getMarks()
    {
        System.out.println("Enter marks in two subjects");
        Scanner s = new Scanner(System.in);
        sub1 = s.nextInt();
        sub2 = s.nextInt();
    }
    void putMarks()
    {
        total = sub1 + sub2;
        System.out.println("Total Marks: "+total);
    }
}// Sub class
class IllustrationOfSingleInheritance
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.getRno(); // Base class method called
        obj.getName(); // Base class method called
        obj.getMarks(); // Derived child method is called
        System.out.println("Student Details: ");
        obj.putRno(); // Parent Class
        obj.putName(); // Parent Class
        obj.putMarks(); // Child Class
    }
}