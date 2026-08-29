package strings;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        sc.close();
        String temp = s2;

        if(s1.length() == s2.length()) {
            int i = 0;
            while(i < s1.length()) {
                char ch = s1.charAt(i);
                int index = temp.indexOf(ch);

                if(index == -1) {
                    System.out.println("Not an anagram");
                    return;
                }
                
                temp = temp.substring(0, index) + temp.substring(index + 1);
                i++;
            }
            System.out.println("Anagram detected");
        }
    }
}
