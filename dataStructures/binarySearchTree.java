package dataStructures;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            return;
        }

        Node current = root;

        if (data < current.data) {
            if (current.left == null) {
                current.left = new Node(data);
            } else {
                current.left = insert(current.left, data);
            }
        } 
        else if (data > current.data) {
            if (current.right == null) {
                current.right = new Node(data);
            } else {
                current.right = insert(current.right, data);
            }
        }
    }

    private Node insert(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insert(current.left, data);
        } 
        else if (data > current.data) {
            current.right = insert(current.right, data);
        }

        return current;
    }

    public void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}

public class binarySearchTree {
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
}