package searching;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Saritha");
        map.put(102, "Pallavi");
        map.put(103, "Nitish");
        map.put(104, "Pavithra");

        int key = 102;
        if(map.containsKey(key)) {
            System.out.println("Found: " + map.get(key));
        }
        else {
            System.out.println("Not found");
        }
    }
}