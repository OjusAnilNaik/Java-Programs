package dataStructures;
import java.util.*;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.addFirst(5);
        q.addLast(50);
        System.out.println(q);
        q.removeLast();
        q.removeFirst();
        System.out.println(q);
    }
}
