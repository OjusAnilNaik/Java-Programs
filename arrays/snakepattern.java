package arrays;
import java.util.*;

public class snakepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements: ");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        } 

        sc.close();

        System.out.println("Snake pattern");

        for(int i=0; i<rows; i++) {
            if(i%2 == 0) {
                for(int j=0; j<cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for(int j=cols-1; j>=0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
