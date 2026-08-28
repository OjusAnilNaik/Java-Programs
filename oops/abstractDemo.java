package oops;
import java.util.Scanner;

class Base {
    void display(int value) {
        System.out.println("Base class");

    }
}

class Derived extends Base {
    void display(int value) {
        
        System.out.println("Derived class");
        System.out.println("The given input is " + value);
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        Base obje = new Base();
        obje.display(value);
        Base obj = new Derived();
        obj.display(value);

        sc.close();
    }
}