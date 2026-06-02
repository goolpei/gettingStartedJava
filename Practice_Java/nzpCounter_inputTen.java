import java.util.Scanner;

public class nzpCounter_inputTen{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
 
        int[] nums = new int[10];
        int negative = 0, zero = 0, positive = 0;
        int i = 0;

        System.out.print("Enter ten numbers: ");
        while(i < 10) nums[i++] = sc.nextInt();

        i = 0;
        while(i < 10){
            if(nums[i] < 0) negative++;
            else if(nums[i] == 0) zero++;
            else positive++;
            i++;
        }

        System.out.println("Negatives: " + negative);
        System.out.println("Zeroes: " + zero);
        System.out.println("Positives: " + positive);
        
        sc.close();


    } 
}