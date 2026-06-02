
import java.util.Scanner;

public class Function_MinMaxSum{


    public static int getMin(int[] arr, int size){
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    
    public static int getMax(int[] arr, int size){
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    public static int getSum(int[] arr, int size){
        int sum = 0;
        for (int i = 0; i < size; i++) sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Min: " + getMin(arr, arr.length));
        System.out.println("Max: " + getMax(arr, arr.length));
        System.out.println("Sum: " + getSum(arr, arr.length));



    }

}