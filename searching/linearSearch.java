package searching;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();

        int [] array = new int[num];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int position = -1;

        for(int i = 0; i < num; i++) {
            if(array[i] == target) {
                position = i;
                System.out.println("Target element found at position(index): " + position);
                break;
            }
        }
        if(position == -1) {
            System.out.println("Target element not found in given array");
        }
        sc.close();
    }
}
