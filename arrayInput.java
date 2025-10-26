
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        
        System.out.print("Enter five numbers: ");
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
        }
        
        System.out.print("You entered: ");
        for(int i = 0; i < 5; i++){
            System.out.print(num[i] + " ");
        }

    }
}
