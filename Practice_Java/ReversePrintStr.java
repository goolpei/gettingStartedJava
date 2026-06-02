public class ReversePrintStr {
    public static void main(String[] args) {
        String str = "I love Nayeon!";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        char temp;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
