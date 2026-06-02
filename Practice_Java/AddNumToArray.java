
import java.util.Scanner;

public class AddNumToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0, j;

        

        while (true) { 
            System.out.print("\nAdd number to array (enter 'x' to exit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("x")){
                break;
            }

            try {
                int num = Integer.parseInt(input);
 
                if(i >= arr.length){
                    System.out.println("\nArray is full.");
                    break;
                }

                arr[i] = num;
            } catch (NumberFormatException e) {
                System.out.print("\nInvalid input.\n");
                continue;
            }

            i++;
            j = 0;
            System.out.print("\nArray contents: [ ");
            while(j < i){
                System.out.print(arr[j++] + " ");
            }
            System.out.print("]\n");

        }

        System.out.println("\nProgram terminated.\n");

        sc.close();
    }
}