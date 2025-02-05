import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of contacts: ");
        int numberOfContacts = scanner.nextInt();
        scanner.nextLine();
        String[] contacts = new String[numberOfContacts];
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.print("Enter contact name " + (i + 1) + ": ");
            contacts[i] = scanner.nextLine();
        }
        System.out.print("Enter the prefix to search for: ");
        String prefix = scanner.nextLine();
        List<String> results = searchContactsStartingWith(contacts, prefix);
        if (results.isEmpty()) {
            System.out.println("No contacts found starting with '" + prefix + "'.");
        } else {
            System.out.println("Contacts starting with '" + prefix + "':");
            for (String contact : results) {
                System.out.println(contact);
            }
        }

        scanner.close();
    }
    public static List<String> searchContactsStartingWith(String[] contacts, String prefix) {
        List<String> matches = new ArrayList<>();
        for (String contact : contacts) {
            if (contact.startsWith(prefix)) {
                matches.add(contact);
            }
        }
        return matches;
    }
}
