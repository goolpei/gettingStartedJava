public class minimumValue {
    public static void main(String[] args){

        int[] arr = {2, 3, 5, 6, 9};
        int n = 5, min = arr[0];

        for(int i = 0; i < n; i++) if(arr[i] < min) min = arr[i];
        System.out.println("Minimun value: " + min);
    }
}
