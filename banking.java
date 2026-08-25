import java.util.*;

class Bankaccount {
    int balance;
    public Bankaccount(int balance) {
        this.balance = balance;
    }

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposit completed");
    }

    int getBalance() {
        return balance;
    }
}

class Customer extends Thread {
    Bankaccount account;
    int amount;

    Customer(Bankaccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount1: ");
        int amt1 = sc.nextInt();

        System.out.println("Enter amount2: ");
        int amt2 = sc.nextInt();

        int b = 10000;
        Bankaccount b1 = new Bankaccount(b);

        Customer c1 = new Customer(b1, amt1);
        Customer c2 = new Customer(b1, amt2);

        c1.setName("Customer - 1");
        c2.setName("Customer - 2");

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + b1.getBalance());

        sc.close();
    }
}