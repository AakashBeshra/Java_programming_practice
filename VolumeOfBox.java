import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    // Constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the volume
    double getVolume() {
        return length * width * height;
    }
}

public class VolumeOfBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();

        scanner.close();

        Box box = new Box(length, width, height);
        double volume = box.getVolume();

        System.out.println("The volume of the box is: " + volume);
    }
}
