package basics;
import java.util.Scanner;
public class water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of container: ");
        int R = sc.nextInt();
        System.out.println("Enter the height of container: ");
        int H = sc.nextInt();
        double V  = (int)(Math.round(3.14 * R * R * H));
        System.out.println("Volume of container is: " + V);
        sc.close();
    }
}
