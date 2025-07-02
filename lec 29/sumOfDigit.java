
// 1. Given an integer find out the sum of its digits using recursion

public class sumOfDigit {
    
    public static void main(String[] args) {
        
        System.out.println(findSum(193));

    }

    static int findSum(int n)
    {
       
       // base case --> jis chiz ka answer hme dekh ke pat rahe
       if(n>=0 && n<=9)
       {
        return n;
       }

        // findSum(n/10) --> smaller problem
        // n%10  --> self work
        return findSum(n/10)+n%10;
    }
}


/*

Time complexity = No of recursive calls * Time taken in one call

where no of recursive call no of digit ke barabar ha 
--> hm maan lete ha number of digit == d

Time complexity = O(d) where d is number of digit
Space complexity = O(d) where d number of digit ha aur yaha jitne digit ha utne call stack frame bn rahe ha 


 */

