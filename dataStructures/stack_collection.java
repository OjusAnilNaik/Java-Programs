package dataStructures;
import java.util.Stack;

public class stack_collection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements are: " + stack);
        System.out.println("Popped element is: " + stack.pop());
        stack.peek();
        System.out.println(stack.isEmpty());
    }
}