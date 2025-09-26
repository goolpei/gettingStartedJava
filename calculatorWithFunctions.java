
import java.util.Scanner;



public class calculatorWithFunctions {

    public static float add(float a, float b){
        return a + b;
    }
    public static float minus(float a, float b){
        return a - b;
    }
    public static float multiply(float a, float b){
        return a * b;
    }
    public static float divide(float a, float b){
        return a / b;
    }

    
    public static void main(String[] args) {

        float num1 = 0, num2 = 0;
        char operation, choice;
        String result = null;
        
        Scanner scanner = new Scanner(System.in);

        while (true) { 

        while(true){
        try {
            System.out.print("Enter first number: ");
            num1 = scanner.nextFloat();
            break;
        } catch (Exception e) {
            System.out.println("Invalid input, please try again.");
            scanner.next();
        }
        }
    
        while (true) { 
            
        System.out.print("Enter operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

         if(operation != '+' && operation != '-' && operation != '*' && operation != '/'){
            System.out.println("Please enter a valid operator (+, -, *, /).");
            } else {
                break;
            }
        }

        while (true) { 
        try {
            System.out.print("Enter second number: ");
            num2 = scanner.nextFloat();
            break;
        } catch (Exception e) {
            System.out.println("Invalid input, please try again.");
            scanner.next();
        }
        
        }

        if(operation == '+'){
            result = String.valueOf(add(num1, num2));
        } else if(operation == '-'){
            result = String.valueOf(minus(num1, num2));
        } else if(operation == '*'){
            result = String.valueOf(multiply(num1, num2));
        } else if(operation == '/'){
            if (num2 == 0){
                result = "undefined";
            } else {
                result = String.valueOf(divide(num1, num2));
            }
        }

        System.out.println(num1 + " " + operation + " " + num2 +  " = " + result);

        System.out.print("Do u want to continue? (Y/N): ");
        choice = scanner.next().charAt(0);
        if(choice != 'y' && choice != 'Y'){
            break;
        } 

        }
        scanner.close();
        System.out.println("Process terminated.");
    }
  
}
