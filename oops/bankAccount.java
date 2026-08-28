package oops;
import java.util.Scanner;
class Bank {

    private float balance;
    private String accountNumber;
    private String accountHolderName;

    Bank(float balance, String accountNumber, String accountHolderName) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 1000 && amount > 0 ) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Minimum balance of 1000 must be maintained.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }
}

public class bankAccount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank(1000, "123456", "John Doe");
        double dep = sc.nextDouble();
        double with = sc.nextDouble();
        b1.deposit(dep);
        b1.withdraw(with);
        b1.display();
        sc.close();
    }
}