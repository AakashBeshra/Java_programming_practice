/* Write a Java program to create an abstract class named Shape that contains two integers and an empty method named print Area ().
Provide three classes named Rectangle, Triangle, and Circle such that each one of the classes extends the class shape.
Each one of the classes contains only the method printArea() that prints the area of the given shape.
*/
import javax.swing.JOptionPane;

abstract class Shape {
    int dimension1;
    int dimension2;

    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    abstract String printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    String printArea() {
        int area = dimension1 * dimension2;
        return "Area of Rectangle: " + area + "\n";
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    String printArea() {
        double area = 0.5 * dimension1 * dimension2;
        return "Area of Triangle: " + area + "\n";
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    @Override
    String printArea() {
        double area = Math.PI * dimension1 * dimension1;
        return "Area of Circle: " + area + "\n";
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter length of the rectangle:"));
        int breadth = Integer.parseInt(JOptionPane.showInputDialog("Enter breadth of the rectangle:"));
        Shape rectangle = new Rectangle(length, breadth);
        result.append(rectangle.printArea());

        int base = Integer.parseInt(JOptionPane.showInputDialog("Enter base of the triangle:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height of the triangle:"));
        Shape triangle = new Triangle(base, height);
        result.append(triangle.printArea());

        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter radius of the circle:"));
        Shape circle = new Circle(radius);
        result.append(circle.printArea());vs

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
