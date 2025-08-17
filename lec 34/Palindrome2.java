
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s,0,s.length()-1));
    }

    static boolean checkPalindrome(String s,int l, int r)
    {
        // base case
        if(l>=r)
        {
            return true;
        }

        return ( s.charAt(l) == s.charAt(r) && checkPalindrome(s,l+1,r-1));

    }
}

// follow up question above program is written for a integer

/*


Time complexity = no of call * constant number of operation

no of call = length of string
constant number of operation = if else and && operator and we ignore the conatnat operation


TC = O(n) where n is length of string

*/