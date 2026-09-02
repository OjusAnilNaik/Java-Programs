package dataStructures;

class implementation {
    int front = -1;
    int rear = -1;
    int [] array = new int[5];
    int size = array.length;

    public void enqueue(int data) {
        if(rear == size - 1) {
            System.out.println("Queue is full!! Cannot enqueue " + data);
        }
        else {
            if(front == -1) {
                rear++;
                front++;
                array[rear] = data;
            }
            else {
                array[++rear] = data;
            }
        }
    }

    public void dequeue() {
        int element;
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        }
        else if (front == rear) {
            System.out.println("Dequeued element is: " + array[front]);
            front = -1;
            rear = -1;
        }
        else {
            element = array[front];
            System.out.println("Dequeued element is: " + element);
            front ++;
        }
    }

    public void peek() {
        if(front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Peek element is: " + array[front]);
        }
    }

    public void display() {
        if(front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Queue elements are: ");
            for(int i = front ; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

public class queue {
    public static void main(String[] args) {
        implementation obj = new implementation();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.dequeue();
        obj.peek();
        obj.display();
    }
}
