import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        int sum = 0;

        while(true){
            System.out.print("Enter number (Enter 0 to stop): ");
            nums = sc.nextInt();
            sum += nums;
            if(nums == 0) break;
        }
        System.out.println("Sum: " + sum);
    }
}
