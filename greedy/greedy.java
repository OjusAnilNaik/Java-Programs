package greedy;

import java.util.*;

public class greedy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
    
        int amount = sc.nextInt();
        Arrays.sort(coin);
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            while (amount >= coin[i]) {
                amount -= coin[i];
                count++;
                System.out.println("The coin selected is: " + coin[i]);
            }
        }
        System.out.println("Minimum coin required: " + count);
        sc.close();
    }
}