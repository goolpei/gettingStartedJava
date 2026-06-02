
import java.util.Scanner;



public class Function_Multiply {

    public static int multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + multiply(num1, num2));

        sc.close();



    }
}
