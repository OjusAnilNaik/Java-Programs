package dataStructures;

import java.util.*;

public class queue_collection {
    //static Queue<Integer> queue = new LinkedList<>();
    static Queue<Integer> queue = new PriorityQueue<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Queue operations");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        while (true) {

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int data = sc.nextInt();
                    enqueue(data);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Enqueue operation
    public static void enqueue(int data) {
        queue.offer(data); // queue.add(data);
        System.out.println(data + " added to queue.");
    }

    // Dequeue operation
    public static void dequeue() {

        if (!queue.isEmpty()) {
            int data = queue.poll(); // queue.remove();
            System.out.println(data + " removed from queue.");
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Display operation
    public static void display() {

        if (!queue.isEmpty()) {
            System.out.println("Queue elements: " + queue);
        } else {
            System.out.println("Queue is empty.");
        }
    }
}