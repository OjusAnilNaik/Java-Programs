import java.util.*;

public class example {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = (2*n)-1;
        for(int i=0 ; i < size ; i++) {
            for(int j=0 ; j < size ; j++) {
                int min1 = Math.min(size-i-1, size-j-1);
                int min2 = Math.min(i, j);
                int mini = Math.min(min1, min2);
                System.out.print(n-mini);

            }
            System.out.println();
        }
        sc.close();
    }
}
