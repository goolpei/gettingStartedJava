import java.util.Scanner;

public class areaRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length, width, area;

        System.out.print("Enter length and width: ");
        length = sc.nextInt();
        width = sc.nextInt();
        area = length * width;
        System.out.println("Area: " + area);
        
        sc.close();

    }
}