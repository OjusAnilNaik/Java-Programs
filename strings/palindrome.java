package strings;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string: ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }

        if(isPalindrome) {
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given string is not a palindrome");
        }

        sc.close();
    }
}
