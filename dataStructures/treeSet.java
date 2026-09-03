package dataStructures;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(50);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        System.out.println("TreeSet: " + tree);
        tree.remove(40);
        System.out.println(tree.contains(40));
        System.out.println(tree);
    }
}
