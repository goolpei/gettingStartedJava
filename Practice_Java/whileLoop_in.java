import java.util.Scanner;

public class whileLoop_in {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int i = 0;

        System.out.print("Enter five numbers: ");
        while(i < 5){
            nums[i] = sc.nextInt(); 
            i++;
        }

        System.out.print("You entered: ");
        i = 0;
        while(i < 5){
            System.out.print(nums[i] + " ");
            i++;
        }
        sc.close();
    }
}
