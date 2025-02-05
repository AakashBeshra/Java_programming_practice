// Write a Java Application to sort all the names in alphabetical order
import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();
    
        String[] names = new String[numberOfNames];
        
    
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
    
        Arrays.sort(names);
    
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
