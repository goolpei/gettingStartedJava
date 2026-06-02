import java.util.ArrayList;
import java.util.Collections; // Needed for sorting
import java.util.Scanner;

public class VIPGuestList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of guests: ");
        int n = sc.nextInt();
        sc.nextLine(); // Great job keeping this!

        System.out.println("Enter guests' names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name); // Simpler than names.add(i, name)
        }

        System.out.print("Enter blacklisted name: ");
        String blacklisted = sc.nextLine();

        // FIX: Remove ALL instances of the blacklisted name
        names.removeIf(guest -> guest.equals(blacklisted));

        // FIX: Sort the list alphabetically
        Collections.sort(names);

        // Printing the final results
        System.out.println("\nFinal List: " + names); 
        System.out.println("Total Guests: " + names.size());
        
        // If you want to print names one by one:
        System.out.println("Seating Chart:");
        for (String guest : names) {
            System.out.println("- " + guest);
        }
    }
}