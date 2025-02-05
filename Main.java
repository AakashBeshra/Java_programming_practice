// Student Information Program 7
import java.util.Scanner;

class Student {
    int r_no;
    String name;

    void getStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number and name:");

        // Reading the roll number first
        r_no = sc.nextInt();
        sc.nextLine();  // Consume the newline character left after nextInt()

        // Reading the name
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Roll number: " + r_no);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student(); // Create a Student object
        student.getStudentInfo();        // Call method to get student info
        student.display();               // Call method to display student info
    }
}
