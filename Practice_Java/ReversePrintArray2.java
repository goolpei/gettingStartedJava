public class ReversePrintArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = new int[100];
        int i = arr.length - 1;
        int j = 0;
        while(i >= 0){
            result[j] = arr[i];
            j++;
            i--;
        }
        i = 0;
        while(i < arr.length){
            System.out.print(result[i] + " ");
            i++;
        }
    }
}
