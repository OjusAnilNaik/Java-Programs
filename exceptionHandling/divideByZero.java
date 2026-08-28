package exceptionHandling;
import java.util.Scanner;

public class divideByZero {
    public static void main (String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.println("Enter the denominator: ");
            int denominator = sc.nextInt();
            sc.close();
            if(denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            int division = numerator / denominator ;
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error!" + e.getMessage());
        } finally {
            System.out.println("Problem Solved");
        }
    }
}
