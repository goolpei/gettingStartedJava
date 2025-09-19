
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) { 
        
        double num1, num2, answer;
        char operator;

        try {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            continue;
        }

        System.out.print("Enter operator: ");
        operator = scanner.next().charAt(0);

        try {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            continue;

        }

        answer = 0;
            
        
            if (operator == '+') {
                answer = num1 + num2;
            } else if (operator == '-'){
                answer = num1 - num2;
            } else if (operator == '*'){
                answer = num1 * num2;
            } else if (operator == '/'){
                if (num2 == 0){
                    System.out.println(num1 +" "+ operator +" "+ num2 +" "+ "=" +" "+ "Undefined");
                    System.out.println("Do you want to continue? Y/N ");
                    char choice = scanner.next().charAt(0);

                    if (choice == 'Y' || choice == 'y'){
                        continue;
                        } else {
                        break;
                        }
                } else {
                answer = num1 / num2;}
            } else {
                System.out.println("Please enter a valid operator.");
                continue;
            }

            System.out.println(num1 +" "+ operator +" "+ num2 +" "+ "=" +" "+ answer );


            System.out.println("Do you want to continue? Y/N ");
            char choice = scanner.next().charAt(0);

            if (choice == 'Y' || choice == 'y'){
                continue;
            } else {
                break;
            }

            
        }

        System.out.println("Process terminated.");
        scanner.close();
        
    }
}
