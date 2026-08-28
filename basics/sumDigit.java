package basics;
import java.util.Scanner;

class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%9==0? 9:n%9);
        sc.close();
    }
}