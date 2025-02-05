public class VolumeCalculator {

    // Method to calculate the volume of a rectangular box
    public double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate the volume of a sphere
    public double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate the volume of a cylinder
    public double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate the volume of a cube
    public double volume(int side) {
        return Math.pow(side, 3);
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Calculate the volume of a rectangular box
        double boxVolume = calculator.volume(10.0, 5.0, 4.0);
        System.out.println("Volume of the rectangular box: " + boxVolume);

        // Calculate the volume of a sphere
        double sphereVolume = calculator.volume(3.0);
        System.out.println("Volume of the sphere: " + sphereVolume);

        // Calculate the volume of a cylinder
        double cylinderVolume = calculator.volume(3.0, 7.0);
        System.out.println("Volume of the cylinder: " + cylinderVolume);

        // Calculate the volume of a cube
        double cubeVolume = calculator.volume(4);
        System.out.println("Volume of the cube: " + cubeVolume);
    }
}
