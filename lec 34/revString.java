
// 2. Write a program to print reverse of a string using recursion

import java.util.Scanner;
public class revString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(Reversed(s,0));
    }

    static String Reversed(String s,int idx)
    {
        //base case
        if(s.length() == idx)
        {
            return "";
        }
        // recursive work
        String smallAns = Reversed(s,idx+1);

        // self work
        return smallAns+s.charAt(idx);

    }
}


/*

Time complexity = no of call * time taken in one call.

no of call = String.length()
time taken in one call = c * string conaction(liner operation)

TC = O(n*n)

 */
