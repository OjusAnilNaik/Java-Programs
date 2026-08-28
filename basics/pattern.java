package basics;
import java.util.Scanner;
public class pattern {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int a=1, b=(r*r)+1;
        for (int i=r; i>=1; i--) {
            for (int j=1; j<=r-i; j++) {
                System.out.print("--");  
            }
            for (int h=1; h<=i; h++) {
                System.out.print(a++ + "*");
            }
            for (int k=1; k<i; k++) {
                System.out.print(b++ + "*");
            }
            System.out.println(b);
            b=b-2*(i-1);
        }
        sc.close();
    }
}