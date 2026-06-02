
import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.print("\nMenu (Inventory System)\n1. Show Items\n2. Sell Item\n3. Exit\nEnter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("\nItems\n1. Book\n2. Pencil\n3.Ballpen\n4. Paper\n5. Notebook");
                }
                case 2 -> {
                }
                case 3 -> {
                }
                default -> {
                    
                }
            }
        }while(choice != 3);
    }
}