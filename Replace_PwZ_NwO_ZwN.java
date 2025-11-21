public class Replace_PwZ_NwO_ZwN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, -1, -2, -4, 2, 1, 9};
        int i = 0, zeroes = 0, ones = 0, negativeOnes = 0, changeCount;


        System.out.print("\nArray content: [ ");
        while(i < arr.length) System.out.print(arr[i++] + " ");
        System.out.print("]");

        i = 0;
        while(i < arr.length){
            if(arr[i] > 0){arr[i] = 0; zeroes++;}
            else if(arr[i] < 0){arr[i] = 1; ones++;}
            else {arr[i] = -1; negativeOnes++;}
            i++;
        }

        changeCount = zeroes + ones + negativeOnes;

        i = 0;
        System.out.print("\nReplaced array: [ ");
        while(i < arr.length) System.out.print(arr[i++] + " ");
        System.out.print("]\n");

        System.out.print("Total of numbers changed: " + changeCount + "\n");

    }
}
