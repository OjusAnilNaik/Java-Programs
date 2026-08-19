import java.util.Scanner;

abstract class Shape {
    abstract void draw(int value);
}

class Rectangle extends Shape {
    void draw(int value) {
        System.out.println("Rectangle");
        System.out.println("The given input is " + value);
    }
}

class Circle extends Shape {
    void draw(int value) {
        System.out.println("Circle");
        System.out.println("The given input is " + value);
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.draw(value);
        s2.draw(value);
        sc.close();
    }
}
