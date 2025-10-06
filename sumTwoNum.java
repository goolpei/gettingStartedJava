
import java.util.Scanner;

public class sumTwoNum {

    public static void main(String[] args) {
        int num1, num2, sum;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum: " + sum);

    }
    
}