
import java.util.Scanner;

public class ID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name, school, course;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter school: ");
        school = sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();

        System.out.println("----I.D----");
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
        System.out.println("Course: " + course);

    }
    
}
