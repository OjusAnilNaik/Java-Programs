import java.util.Scanner;

class moneyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senderbalance = 30000;

        System.out.println("Enter sender account number: ");
        int sender = sc.nextInt();

        System.out.println("Enter receiver account number: ");
        int receiver = sc.nextInt();

        System.out.println("Enter amount to be transfered: ");
        int transfer = sc.nextInt();

        sc.close();

        try {
            if (sender == receiver) {
                throw new Exception("Sender and Receiver account number cannot be the same");
            }

            else if (transfer > 50000) {
                throw new Exception("Transfer amount should not exceed 50000");
            }

            else if(transfer > senderbalance) {
                throw new Exception("Insufficient balance");
            }

            else if (transfer <= 0) {
                throw new Exception("Transfer amount must be positive");
            }

            else {
                System.out.println("ENter valid input");
            }

            senderbalance = senderbalance - transfer;

        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        finally {
            System.out.println("Successfull program execution");
        }
    }
}