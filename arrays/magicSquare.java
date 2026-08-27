package arrays;
import java.util.*;

public class magicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicSum1 = 0;
        int magicSum2 = 0;
        
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        if(rows != cols) {
            sc.close();
            System.out.println("Magic Square is only possible for square matrix");
            return;
        }

        System.out.println("Enter array elements: ");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<cols; i++) {
            for(int j=0; j<cols; j++) {
                if(i==j) {
                    magicSum1 += matrix[i][j];
                }
            }
        }

        for(int i=0; i<cols; i++) {
            magicSum2 += matrix[i][cols-i-1];
        }

        if(magicSum1 == magicSum2) {
            System.out.println("The given matrix is a magic square");
        }
        else{
            System.out.println("The given matrix is not a magic square");
        }
    
        sc.close();
    }
}
