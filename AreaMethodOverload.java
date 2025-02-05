// Write a Java Program for Area Method Overloading program 23
class Area {
    // Method for circle area
    void area(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }

    // Method for rectangle area
    void area(int l, int b) {
        int area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }

    // Method for box volume (not area)
    void area(int l, int b, int h) {
        int volume = l * b * h;
        System.out.println("Volume of box is: " + volume);
    }

    // Method for triangle area using double type
    void area(double b, double h) {
        double area = 0.5 * b * h;
        System.out.println("Area of triangle is: " + area);
    }
}

class AreaMethodOverload {
    public static void main(String args[]) {
        Area obj = new Area();
        obj.area(5);            // Circle
        obj.area(5, 6);         // Rectangle
        obj.area(5, 6, 7);      // Box
        obj.area(5.0, 6.0);     // Triangle (using double to avoid conflict)
    }
}
