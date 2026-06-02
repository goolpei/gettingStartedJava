import java.util.Scanner;

public class simpleGradingSystemWithRemarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter your grade: ");
            int grade = scanner.nextInt();
            String remarks;

            if (grade < 0 || grade > 100) {
                remarks = "Invalid grade";
            } else if (grade < 75) {
                remarks = "Failed";
            } else if (grade >= 75 && grade <= 84) {
                remarks = "Passed";
            } else if (grade >= 85 && grade <= 89) {
                remarks = "Very Good";
            } else if (grade >= 90 && grade <= 96) {
                remarks = "With High Honors";
            } else {
                remarks = "With Highest Honors";
            }

            System.out.println("Your remarks: " + remarks);

            // Ask user if they want to continue
            System.out.print("Do you want to enter another grade? (yes/no): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes")); // loop if user types yes

        System.out.println("Program ended.");
        scanner.close();
    }
}
