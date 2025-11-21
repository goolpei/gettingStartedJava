
import java.util.Scanner;

public class AddNumToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i = 0, j;

        while (true) { 
            System.out.print("Add number to array (enter 'x' to exit): ");
            
            try {
            arr[i] = sc.nextInt();
            } catch (Exception e) {
            sc.next();
            break;
            }

            i++;
            j = 0;
            System.out.print("\nArray contents: [ ");
            while(j < i){
                System.out.print(arr[j++] + " ");
            }
            System.out.print("]\n");

        }

        System.out.println("Program terminated.\n");

        sc.close();
    }
}