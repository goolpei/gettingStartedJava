import java.util.Scanner;

public class addIntString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		char b;

		System.out.print("Enter Num: ");
		a = sc.nextInt();
		System.out.print("Enter Character: ");
		b = sc.next().charAt(0);

		System.out.println(a + "" + b);
	}
}
