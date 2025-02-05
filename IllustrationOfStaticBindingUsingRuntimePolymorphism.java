// Illustration Of Static Binding using Runtime Polymorphism
class Shape
{
    public void display()
    {
        System.out.println("Display Shape");
    }
}
class Rectangle extends Shape
{
    public void display()
    {
        System.out.println("Display Rectangle");
    }
}
class Circle extends Shape
{
    public void display()
    {
        System.out.println("Display Circle");
    }
}
class IllustrationOfStaticBindingUsingRuntimePolymorphism
{
    public static void main(String args[])
    {
        Shape s;
        s = new Rectangle();
        s.display();
        s = new Circle();
        s.display();
        s = new Shape();
        s.display();
    }
}