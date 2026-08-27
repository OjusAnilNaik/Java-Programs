package arrays;
import java.util.*;

public class secondLaregst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println("Second largest element: " + arr[size-2]);
    }
}
