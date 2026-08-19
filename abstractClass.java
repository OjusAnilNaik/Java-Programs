import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void draw() {
        System.out.println("Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void draw() {
        System.out.println("Circle");
        System.out.println("Radius: " + radius);
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s1 = new Rectangle(5, 10);
        Shape s2 = new Circle(7);
        s1.draw();
        s2.draw();
        sc.close();
    }
}
