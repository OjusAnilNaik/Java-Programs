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

class SinglyLinkedList{
    Node head = null ;

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

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = null;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if(position == 1) {
            insertAtBeginning(data);
        }
        else {
            Node current = head;
            for(int i = 1; i < position - 1; i++) {
                if(current != null) {
                    current = current.next;
                }
                else {
                    System.out.println("Position is out of bounds");
                    return;
                }
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteAtEnd() {
        if(head == null) {
            System.out.println("The list is empty");
        }
        else if(head.next == null) {
            head = null;
        }
        else {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            System.out.println("The deleted element is: " + current.next.data);
            current.next = null;
        }
    }

    public void deleteAtBeginning() {
        if(head == null) {
            System.out.println("The list is empty");
        }
        else if(head.next == null) {
            System.out.println("The deleted element is: " + head.data);        
            head = null;
        }
        else {
            System.out.println("The deleted element is: " + head.data);
            head = head.next;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("The list is empty");
        }
        else {
            while(current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
}

public class SLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(30);
        list.insertAtBeginning(10);
        list.insertAtPosition(20, 2);
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.display();
        sc.close();
    }
}
