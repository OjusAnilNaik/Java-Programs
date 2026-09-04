package dynamicProgramming;
import java.util.Scanner;

public class dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int [] dp = new int [10];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        for(int i = 0; i < n; i++) {
            System.out.println("The sequence " + dp[i]);
        }
        sc.close();
    }
}
