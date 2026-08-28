package basics;
import java.util.Scanner;
public class MangoTree {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt(); Row input was not needed since row is not anywhere for calculation
        int columns = sc.nextInt();
        int tree = sc.nextInt();

        if ( tree <= columns || tree % columns == 0 || tree % columns ==1) {
            System.out.println("Mango Tree");
        } else {
            System.out.println("Not a Mango Tree");
        }
        sc.close();
    }
}
