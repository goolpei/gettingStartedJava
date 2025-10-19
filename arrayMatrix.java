public class arrayMatrix {
    public static void main(String[] args){
        int[][] matrix = {
            {2, 4, 1},
            {0, 4, 2},
            {9, 5, 3}
        };

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
