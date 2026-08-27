package arrays;
import java.util.*;
class toyland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of houses: ");
        int num = sc.nextInt();
        int[] houseNum = new int[num];
        int[] position = new int[num];
        for (int i = 0; i < num; i++) {
            houseNum[i] = sc.nextInt();
            position[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (position[i] > position[j]) {
                    int x = position[i];
                    position[i] = position[j];
                    position[j] = x;

                    x = houseNum[i];
                    houseNum[i] = houseNum[j];
                    houseNum[j] = x;
                }
            }
        }
        int max = 0;
        int a = 0, b = 0;
        for (int i = 0; i < num - 1; i++) {
            int d = position[i + 1] - position[i];
            if (d > max) {
                max = d;
                a = houseNum[i];
                b = houseNum[i + 1];
            }
        }
        System.out.println(Math.min(a, b) + " " + Math.max(a, b));
    }
}
