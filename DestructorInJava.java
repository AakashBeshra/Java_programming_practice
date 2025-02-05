//Illustration of gcc() function in Java
public class DestructorInJava {
    public static void main(String[] args) {
        DestructorInJava dij = new DestructorInJava();
        dij.cleanup(); // Manually calling the cleanup method before making the object eligible for GC
        dij = null; // Allow dij to be eligible for garbage collection
        System.gc(); // Requesting JVM to run Garbage Collector
        System.out.println("Inside the main function");
    }
    
    public void cleanup() {
        System.out.println("Inside the cleanup function");
    }
}
