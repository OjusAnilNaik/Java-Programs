package recursion;
import java.util.*;

public class factorial {
    static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        int result = fact(num);
        System.out.println("Factorial of " + num + ": " + result);
    }
}
