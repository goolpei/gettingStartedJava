
import java.util.Scanner;

public class PickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i = 0;
        int j, temp;
        char choice;
        String sort;

        
            
            
            System.out.print("Enter 5 numbers: ");
            while(i < 5){
                arr[i] = sc.nextInt();
                i++;
            }

            System.out.print("Sort Ascending (Enter 'a') or Descending (Enter 'd')?: ");
            choice = sc.next().charAt(0);

            if(choice == 'a'){
                sort = "Ascending";
                i = 0;
                while(i < 5){
                    j = i + 1;
                    while(j < 5){
                        if(arr[j] < arr[i]){
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            
                        }
                        j++; 
                    }
                    i++;
                }
            } else {
                sort = "Descending";
                i = 0;
                while(i < 5){
                    j = i + 1;
                    while(j < 5){
                        if(arr[j] > arr[i]){
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            
                        }
                        j++; 
                    }
                    i++;
                }
            }

            

            System.out.print("Sorted " + sort + ": ");
            i = 0;
            while(i < 5){
                System.out.print(arr[i] + " ");
                i++;
            }
            
            

        

        

        
        sc.close();
    }
}
