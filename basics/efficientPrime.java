package basics;
import java.util.Scanner;
public class efficientPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("No prime numbers");
            sc.close();
            return;
        }
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
