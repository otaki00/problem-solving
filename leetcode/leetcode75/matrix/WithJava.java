/*
This code reads a 5x5 matrix of integers from the user and calculates the minimum number of steps required to move a non-zero element to the center of the matrix.
 */


package matrix;

import java.util.Scanner;

public class WithJava {

    public static void main(String[] args) {
        

        try (Scanner scanner = new Scanner(System.in)) {
            int numRows = 5;
            int numCols = 5;

            int[][] matrix = new int[numRows][numCols];

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

        
            scanner.close();

            
            int row = -7, column = -7;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(matrix[i][j]!=0){
                        row=i; column=j;
                        break;
                    }
                }
            }

            int count = Math.abs(row-2) + Math.abs(column - 2);

            if(count > 4){
                // close the program
                System.exit(0);
            }

            System.out.println(count);
        }

    }
}
