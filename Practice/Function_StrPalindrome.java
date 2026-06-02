
import java.util.Scanner;

public class Function_StrPalindrome {
    public static String reverseStr(String str){
        
        char arr[] = str.toCharArray();
        char temp;
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return new String(arr);
    }

    public static boolean isPalindrome(String str){
        if(str == reverseStr(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        


        System.out.println("Reversed: " + reverseStr(str));

        if(isPalindrome(str)){
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
        
    }
}
