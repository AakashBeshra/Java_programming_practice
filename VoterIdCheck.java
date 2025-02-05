class VoterIdCheck {
    // Method to check eligibility
    public static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            // Throwing an exception for ineligible age
            throw new Exception("Age below 18 is not eligible for Voter ID.");
        }
        System.out.println("You are eligible for a Voter ID.");
    }

    public static void main(String[] args) {
        int age = 16; // Example input
        try {
            // Call the eligibility check
            checkEligibility(age);
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Eligibility check completed.");
        }
    }
}
