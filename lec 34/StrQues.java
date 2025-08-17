// 1. Remove all the occurence of 'a' from string s='abcax'


import java.util.Scanner;

public class StrQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(removeA(s));

       
    }

    // function without first index
    static String removeA(String s){
        //base case
        if(s.length() == 0)
        {
            return "";
        }

        String smallAns = removeA(s.substring(1));

        if(s.charAt(0) != 'a'){
            return s.charAt(0)+smallAns;
        }
        else{
            return smallAns;
        }
    }

    // static String removeA(String s,int idx){
    //     String ans="";

    //     // base case
    //     if(idx == s.length())
    //     {
    //         return ans;
    //     }

    //     if(s.charAt(idx) != 'a')
    //     {
    //         ans+=s.charAt(idx);
    //     }

    //     // recursive work
    //    String smallAns = removeA(s,idx+1);

    //    // self work
    //    return ans+smallAns;
    // }
}




/*
Time complexity of this program

TC = No of call * Time taken in one call

No of call = String.length();
Time Taken = n(string concation) + c(constant time)

TC = n*n+c
   = n*n
   = O(n*n)

*/