
import java.util.Scanner;

public class TempAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int invalid = 0, warm = 0, hot = 0, cold = 0;

        System.out.print("Enter 10 temperatures: ");
        for(int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        System.out.print("\nArray content: [ ");
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.print("]\n");

        for (int i = 0; i < 10; i++) {
            if(arr[i] < 0 || arr[i] > 100) invalid++;
            else if(arr[i] < 20) cold++;
            else if(arr[i] >= 20 && arr[i] <= 30) warm++;
            else hot++;
        }

        System.out.println("Amount of cold temperatures: " + cold);
        System.out.println("Amount of warm temperatures: " + warm);
        System.out.println("Amount of hot temperatures: " + hot);
        System.out.println("Amount of invalid temperatures: " + invalid + "\n");

    }
}
