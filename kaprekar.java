import java.util.Scanner;
public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int square = n * n;
        int rightPart = square % (int) Math.pow(10, digits);
        int leftPart = square / (int) Math.pow(10, digits);
        if (leftPart + rightPart == n) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }

        sc.close();
    }
}
