
// 2. Given two number p & q find the value of p^q using a recursion function

public class PowDigit {
    
    public static void main(String[] args) {
        
        System.out.println(valueOfPow(2,3));
    }

    // static int valueOfPow(int n, int m)
    // {
    //     // base case
    //     if(m==0)
    //     {
    //         return 1;
    //     }


    //     // valueOfPow --> recursive work
    //     // *n --> self work
    //     return valueOfPow(n,m-1)*n;
    // }
    
/*

Time complexity --> O(q) where q is the square of a number
Space Complexity --> O(q) because jitna q ki value ha utna call stack frame banega

 */





    // Better time complexity

    static int valueOfPow(int p, int q)
    {
        if(q==0)
        {
            return 1;
        }

        int smaller = valueOfPow(p,q/2);
        if(q%2==0)
        {
            return smaller*smaller;
        }

        return smaller*smaller*p;
    }
}
