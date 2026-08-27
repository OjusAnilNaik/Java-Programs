package arrays;
import java.util.*;

public class unique {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] elements = new int[size];
        int[] unique = new int[size];
        int k = 0;

        System.out.println("Enter the elements: ");
        for (int i=0; i<size; i++) {
            elements[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<size; i++) {
            boolean found = false;
            for(int j=0; j<size; j++) {
                if (elements[i] == unique[j]) {
                    found = true;
                    break;
                } 
            }
            if(!found) {
            unique[k] = elements[i];
            k++;
        }
        }

        System.out.println("Number of unique elements: " +k);

        for(int i=0; i<k; i++) {
            System.out.println(unique[i]);   
        }
    }
}
