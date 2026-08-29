package searching;
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        
        int[] a = {30,40,50,60};
        HashSet<Integer> map = new HashSet<>();
        for(int i:a) {
            map.add(i);
        }
        int key = 40;
        if(map.contains(key)) {
            System.out.println("Found: " + map.contains(key));
        }
        else {
            System.out.println("Not found");
        }
    }
}