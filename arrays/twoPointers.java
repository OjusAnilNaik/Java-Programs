package arrays;
import java.util.*;

public class twoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int left = 0;
        int right = n - 1;
        int sum = 0;

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        while(left < right) {
            sum = array[left] + array[right];
            if(sum == target) {
                System.out.println("Target reached\n" + array[left] + "+" + array[right] + "=" + target);
                break;
            }
            else if(sum > target){
                right--;
            }
            else {
                left++;
            }
        }
        sc.close();
    }
}
