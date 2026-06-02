import java.util.Scanner;

public class DisplayMultiplicationTable{

    public void displayTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args){
        DisplayMultiplicationTable dis = new DisplayMultiplicationTable();
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        dis.displayTable(num);

        sc.close();
    }



}