
import java.util.Scanner;

public class StopIfStop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String any;
        while(true){ 
            System.out.print("Enter any ('x' to stop): ");
            any = sc.next();
            if("x".equals(any)) break;
            System.out.println("You entered: " + any);
        }
        System.out.println("Session terminated.");
    }
}
