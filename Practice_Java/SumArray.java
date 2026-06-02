import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
