// Write a Java program for Illustration of throw keyword in Java
class ThrowExample {
    // Method to check age eligibility
    public static void checkEligibility(int age) {
        if (age < 18) {
            // Throwing an IllegalArgumentException
            throw new IllegalArgumentException("Age must be 18 or above to be eligible.");
        }
        System.out.println("You are eligible!");
    }

    public static void main(String[] args) {
        try {
            // Passing an invalid age
            checkEligibility(16);
        } catch (IllegalArgumentException e) {
            // Catching and handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
