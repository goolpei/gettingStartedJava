
import java.util.Scanner;

public class VotingMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice = 0, totalVotesA = 0, totalVotesB = 0;

        do{

            System.out.print("\n--Voting-Menu--");
            System.out.print("\n1. Vote Candidate A\n2. Vote Candidate B\n3. Results\n4. Exit\nEnter Choice: ");

            
            try{
                choice = sc.nextInt();
            } catch(Exception e){
                sc.nextLine();
                System.out.print("\nInvalid input.\n");
                continue;
            }
            
            

            switch (choice) {
                case 1 -> {
                    totalVotesA += 1;
                    System.out.print("\nSuccessfully voted A.\n");
                }
                case 2 -> {
                    totalVotesB += 1;
                    System.out.print("\nSuccessfully voted B.\n");
                }
                case 3 -> {
                    System.out.print("\nTotal votes A: " + totalVotesA);
                    System.out.print("\nTotal votes B: " + totalVotesB);
                    if(totalVotesA == 0 && totalVotesB == 0){
                        System.out.print("\nNo votes recorded.\n");
                    } else if(totalVotesA == totalVotesB){
                        System.out.print("\nResult: Tie\n");
                    } else if(totalVotesA > totalVotesB){
                        System.out.print("\nResult: A is the winner.\n");
                    } else {
                        System.out.print("\nResult: B is the winner.\n");
                    }
                }
                case 4 -> {
                    System.out.print("\nThank you for using.\n");
                }
                default -> {
                    System.out.print("\nInvalid input.\n");
                    
                }
            }
            

        }while(choice != 4);

        
        sc.close();


    }
    
}
