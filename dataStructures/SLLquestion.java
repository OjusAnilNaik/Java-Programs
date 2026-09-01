package dataStructures;
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class question {
    Node head = null;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = null;
        } 
        
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }
    }

    public void displayNonNegative() {
        Node current = head;
        while(current != null) {
            if(current.data >= 0) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
    }
}
public class SLLquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        question list = new question();
        System.out.println("Enter number of elements to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }
        System.out.println("Non-negative elements in the linked list:");
        list.displayNonNegative();
        sc.close();
    }
}
