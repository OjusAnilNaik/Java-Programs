import java.util.Scanner;

class voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        try {
            if (age < 18) {
                throw new Exception();
            }
            System.out.println("Eligible to vote");
        }
        catch (Exception e) {
            System.out.println("Not eligible to vote");
        }
        finally {
            System.out.println("WHY DO YOU WORRY HUH!, JUST TO GET A MARK ON YOUR HAND");
        }
    }

}