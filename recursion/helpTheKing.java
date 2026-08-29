package recursion;
import java.util.*;

public class helpTheKing {
    static int power(int b, int e) {
        if(e == 0) {
            return 1;
        }
        else {
            return b * power(b, e - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base value: ");
        int base = sc.nextInt();

        System.out.println("Enter the exponent value: ");
        int exponent = sc.nextInt();

        sc.close();

        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }
}
