public class MinAndMax {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int min = arr[0], max = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
            i++;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
