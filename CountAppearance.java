public class CountAppearance{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 5, 2, 5, 5, 3, 4};
        int i = 0, countFive = 0;
        while(i < 10){
            if(arr[i] == 5) countFive++;
            i++;
        }
        System.out.print("Number of fives: " + countFive);
    }
}