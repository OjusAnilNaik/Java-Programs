import java.util.Scanner;

class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String M = sc.next();

        if (M.equals("Rock") || M.equals("rock") || M.equals("ROCK")) {
            System.out.println("Paper");
        } else if (M.equals("Paper") || M.equals("paper") || M.equals("PAPER")) {
            System.out.println("Scissors");
        } else if (M.equals("Scissors") || M.equals("scissors") || M.equals("SCISSORS")) {
            System.out.println("Rock");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}