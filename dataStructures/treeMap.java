package dataStructures;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(10,"Ten");
        tree.put(20,"twenty");
        tree.put(30,"Thirty");
        tree.put(40,"Forty");
        System.out.println("TreeMap: " + tree);
        tree.remove(30);
        System.out.println(tree.containsKey(20));
        System.out.println(tree);
    }
}
