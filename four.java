import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1002
        int last = Math.abs(n%10); //2
        int first = Math.abs(n/1000); //1
        int sum = first + last; //3
        System.out.println(sum);
        sc.close();
    }
}
