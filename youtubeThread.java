class Process extends Thread {

    synchronized void process(int n) {
        System.out.println("Downloading " + n);
        System.out.println("Updating thumbnail " + n);
        System.out.println("Sending Notification " + n);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            process(i+1);
        }
    }
}

public class youtubeThread {
    public static void main(String[] args) {

        Process p1 = new Process();
        p1.start();
    }
}