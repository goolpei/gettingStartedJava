import java.util.Scanner;

public class enterFullName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter full name: ");
        name = sc.nextLine();
        System.out.print("Hello, " + name +  "!");
    }
}