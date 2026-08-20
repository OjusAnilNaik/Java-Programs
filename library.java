import java.util.*;

interface Borrow {
    void borrowBook(String Student, String BookName);
}

interface Return {
    void returnBook(String Student, String BookName, int duration);
}

class lib implements Borrow, Return {

    public void borrowBook(String Student, String BookName) {
        System.out.println("Student: "+ Student + "\tBook: "+ BookName);
    }

    public void returnBook(String Student, String BookName, int duration) {
        System.out.println("Student: "+ Student + "\tBook: "+ BookName + "\tDuration: "+ duration);
    }
}

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter book name: ");
        String bname = sc.next();
        System.out.println("Enter the duration: ");
        int dur = sc.nextInt();

        lib l1 = new lib();
        l1.borrowBook(name, bname);
        l1.returnBook(name, bname, dur);
        sc.close();
    }
}
