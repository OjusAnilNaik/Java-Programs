package arrays;
import java.util.*;

public class cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the new element: ");
        int newele = sc.nextInt();
        sc.close();
        for(int i=n; i>=pos; i--) {
            array[i]=array[i-1];
        }
        array[pos-1]=newele;
        System.out.println("After insertion: ");
        for(int i=0; i<=n; i++) {
            System.out.println(array[i]);
        }
    }
}
