package sorting;
import java.util.*;

public class insertionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 1; i < n ; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    } 
}
