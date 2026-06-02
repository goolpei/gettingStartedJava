import java.util.Scanner;

public class averageThreeNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double average;
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
    }
}