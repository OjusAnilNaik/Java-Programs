package arrays;

import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements: ");

        for (int i=0; i<n;i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Pattern: ");

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;

        while (top<=bottom && left<=right) {

            for (int j=left; j<= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            for (int i=top; i<= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;


                for (int j=right; j>=left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            

            
                for (int i=bottom; i>=top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            
        }

        sc.close();
    }
}
