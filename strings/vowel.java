package strings;
import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String characters = sc.next();
        int length = characters.length();
        int i = 0;
        int count = 0;

        while(i < length) {
            char ch = characters.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
            i++;
        }

        System.out.println("Total number of vowels in given string is: " + count);
        sc.close();
    }
}
