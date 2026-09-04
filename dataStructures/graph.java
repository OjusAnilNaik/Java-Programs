package dataStructures;
import java.util.*;

public class graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>()); // 0 1 2 3 4 5
        }
        graph.get(0).add(1); //source 0 to destination 1
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(0);
        graph.get(2).add(4);
        graph.get(2).add(0);
        for(int i = 0; i < graph.size(); i++) {
            System.out.println(i + "--> " + graph.get(i));
        }
    }
}
