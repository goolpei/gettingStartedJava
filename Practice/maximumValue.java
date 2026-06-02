public class maximumValue {
    public static void main(String[] args){
        int[] arr = {2, 300, 5, 2, 70};
        int max = arr[0];
        for(int i = 0; i < 5; i++) if(arr[i] > max) max = arr[i];
        System.out.println("Maximum value: " + max); 
    }
}
