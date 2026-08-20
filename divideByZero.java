import java.util.Scanner;

public class divideByZero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            int division = numerator / denominator ;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        } finally {
            System.out.println("Problem Solved");
        }
        sc.close();
    }
}
