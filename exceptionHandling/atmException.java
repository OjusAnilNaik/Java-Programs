package exceptionHandling;
import java.util.Scanner;

class atmException {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100000;
        System.out.println("Enter withdrawl amount: ");
        int withdrawl = sc.nextInt();
        sc.close();
        try {
            if(withdrawl <= 0) {
                throw new ArithmeticException("Error! Withdrawn amount should be positive");
            }
            else if (withdrawl > balance) {
                throw new ArithmeticException("Error! Insufficient balance");
            }
            else {
                balance = balance - withdrawl;
                System.out.println("Amount withdrawn: " + withdrawl);
                System.out.println("Remaining balance: " + balance);
            }
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execution completed");
        }
    }
}