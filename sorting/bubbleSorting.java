package sorting;
import java.util.*;

public class bubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.println("Enter the elements: "); 
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0 ; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
