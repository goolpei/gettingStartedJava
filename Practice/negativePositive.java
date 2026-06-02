public class negativePositive {
    public static void main(String[] args) {
        int[] nums = {2, 4, -1, -5, 0, 0, 5, 0, -3, 10};
        int i = 0, negative = 0, zero = 0, positive = 0;

        while(i < nums.length){
            if(nums[i] < 0){
                negative ++;
            } else if(nums[i] == 0){
                zero ++;
            } else if(nums[i] > 0){
                positive ++;
            }
            i++;
        }

        System.out.println("Negatives: " + negative);
        System.out.println("Zeroes: " + zero);
        System.out.println("Positives: " + positive);
    }
}
