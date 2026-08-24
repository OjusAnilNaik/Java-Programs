class foodPrep extends Thread {
    public void run() {
        try {
            System.out.println("Food preparation started");
            sleep(500);
            System.out.println("Food preparation completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class deliveryPartner extends Thread {
    public void run() {
        try {
            System.out.println("Searching delivery partner");
            sleep(300);
            System.out.println("Delivery partner found");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class notification extends Thread{
    public void run() {
        try {
            System.out.println("Sending order notification");
            sleep(200);
            System.out.println("Notification sent");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class foodOrder {
    public static void main(String[] args) {
        foodPrep f = new foodPrep();
        deliveryPartner d = new deliveryPartner();
        notification n = new notification();
        
        f.start();
        d.start();
        n.start();
    }
}
