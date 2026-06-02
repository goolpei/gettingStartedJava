public class sort {
    public static void main(String[] args){
        int[] nums = {40, 20, 30, 50, 10};
        int i = 0, j, temp;

        while(i < 5){
            j = i + 1;
            while(j < 5){
                if(nums[j] < nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.print("Sort (ascending): ");
        i = 0;
        while(i < 5) System.out.print(nums[i++] + " ");
    }
    
}
