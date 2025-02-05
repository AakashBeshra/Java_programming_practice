// Illustration of Static Binding using Compile Time Polymorphism
class Shape {
    void display()
    {
        System.out.println("Shape");
    }
}
class Rectangle extends Shape
{
    void display()
    {
        System.out.println("It is a Rectangle");
    }
}
class Circle extends Shape{
    void display()
    {
        System.out.println("It is a Circle");
    }
}
class IllustrationOfStaticBindingUsingCompiletimePolymorphism{
    public static void main(String args[])
    {
        // Object creation
        Shape s1 = new Shape();
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        s1.display();
        r1.display();
        c1.display();
    }
}