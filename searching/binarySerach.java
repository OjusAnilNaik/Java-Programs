package searching;

import java.util.*;

public class binarySerach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int left = 0;
        int right = num - 1;

        boolean found = false;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == target) {
                found = true;
                break;
            }
            else if (target < array[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        if (found) {
            System.out.println("Target element found");
        }
        else {
            System.out.println("Target element not found in given array");
        }
        sc.close();
    }
}