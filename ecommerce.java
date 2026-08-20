import java.util.*;

interface MakePayment {
    void payment();
}

interface PlaceOrder {
    void order();
}

interface WriteReview {
    void review();
}

class Customer implements MakePayment, PlaceOrder, WriteReview {

    int choice;

    public Customer(int choice) {
        this.choice = choice;
    }

    public void payment() {
        System.out.println("Customer buying a product");
    }

    public void order() {
        System.out.println("Order Placed");
    }

    public void review() {
        System.out.println("The review is taken");
    }

    public void process() {
        if (choice == 1) {
            payment();
        }
        else if (choice == 2) {
            order();
        }
        else if (choice == 3) {
            review();
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}

public class ecommerce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Make Payment");
        System.out.println("2. Place Order");
        System.out.println("3. Write Review");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Customer customer = new Customer(choice);
        customer.process();

        sc.close();
    }
}