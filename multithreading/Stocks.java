package multithreading;
import java.util.Scanner;

class Stock {
    int stock;
    Stock(int stock) {
        this.stock = stock;
    }

    public synchronized void purchase(int customer) {
        if(stock > 0) {
            stock --;
            System.out.println("Customer " + customer + " purchase successful");
            System.out.println("Remaining stock = " + stock);
         }
        else {
            System.out.println("Customer " + customer + " purchase failed");
            System.out.println("Insufficient stockss!!");
        }
    }
}

class customer extends Thread {
    Stock stock;
    int customer;
    customer(Stock stock, int customer) {
        this.stock = stock;
        this.customer = customer;
    }

    public void run() {
        stock.purchase(customer);
    }
}

class Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of stocks available: ");
        int numStocks = sc.nextInt();
        sc.close();
        Stock stock = new Stock(numStocks);

        customer c1 = new customer(stock, 1);
        customer c2 = new customer(stock, 2);
        customer c3 = new customer(stock, 3);
        customer c4 = new customer(stock, 4);

        try {
            c1.start();
            c1.join();

            c2.start();
            c2.join();

            c3.start();
            c3.join();

            c4.start();
            c4.join();
        } catch (Exception e) {
            System.out.println("Error occured while purchasing stocks!!");
        }
    }
}
