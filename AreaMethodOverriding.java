// Write a Java program for Area Method Overriding Program 24
// Superclass
class Shape {
    // Method for displaying general shape information
    void area() {
        System.out.println("Calculating area of the shape...");
    }
}

// Subclass for Circle
class Circle extends Shape {
    // Overriding the area method for Circle
    @Override
    void area() {
        int r = 5;
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    // Overriding the area method for Rectangle
    @Override
    void area() {
        int l = 5, b = 6;
        int area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    // Overriding the area method for Triangle
    @Override
    void area() {
        double b = 5.0, h = 6.0;
        double area = 0.5 * b * h;
        System.out.println("Area of triangle is: " + area);
    }
}

// Main class to demonstrate method overriding
class AreaMethodOverriding {
    public static void main(String args[]) {
        // Creating objects of each subclass
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        // Calling the overridden methods
        circle.area();       // Circle's area
        rectangle.area();    // Rectangle's area
        triangle.area();     // Triangle's area
    }
}
