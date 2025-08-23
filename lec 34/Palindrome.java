
// 3. Write a program to check given string is palindrome or not

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // method call
        String rev = Reversed(s, 0);

        // checking palindrome or not
        if (s.equals(rev)) {
            System.out.println("yes it is palindrome");
        } else {
            System.out.println("no");
        }

    }

    static String Reversed(String s, int idx) {
        // base case
        if (s.length() == idx) {
            return "";
        }
        // recursive work
        String smallAns = Reversed(s, idx + 1);

        // self work
        return smallAns + s.charAt(idx);

    }
}
