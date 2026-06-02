import java.util.Scanner;

public class SortnCountOddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int temp, odd = 0, even = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        System.out.print("\nArray contents: [ ");
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.print("]\n");
        
        //sort
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array contents (sorted ascending): [ ");
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.print("]\n");

        for (int i = 0; i < 10; i++) {
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Amount of even numbers: " + even);
        System.out.println("Amount of odd numbers: " + odd + "\n");

        sc.close();

    }
}