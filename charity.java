import java.util.Scanner;
public class charity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int totalCoins = days * (days + 1) * (2 * days + 1) / 6;
        System.out.println("Total coins collected: " + totalCoins);
        sc.close();
    }
}
