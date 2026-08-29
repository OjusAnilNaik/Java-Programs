package recursion;
import java.util.*;

class maxsize {
    static int largest(int[] size, int num) {
        if (num == 1) {
            return size[0];
        }
        int max = largest(size, num - 1);
        return Math.max(max, size[num - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of animals: ");
        int num = sc.nextInt();

        int[] sizes = new int[num];

        System.out.println("Enter the sizes: ");
        for (int i = 0; i < num; i++) {
            sizes[i] = sc.nextInt();
        }
        sc.close();

        int MAX = largest(sizes, num);
        System.out.println("Max size: " + MAX);
    }
}