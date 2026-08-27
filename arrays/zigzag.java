package arrays;
import java.util.*;

class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter array elements:");

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Zigzag traversal:");

        for (int j=0; j <columns; j++) {
            sum +=(matrix[0][j]);
        }

        for (int i=1; i < rows-1; i++) {
            sum += (matrix[i][columns-1-i]);
        }

        for (int j=0; j <columns; j++) {
            sum += (matrix[rows-1][j]);
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}