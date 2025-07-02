
// 1. Program to find 5!


public class Factorials {
    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) 
    {
        // base case 
        if(n==0)
        {
            return 1;
        }

        // recursive work
        int smaller = fact(n-1);

        // self work
        return smaller*n;
    }
}


// time complexity O(n)
// space complexity O(n) -> jitna n ka value ha utna stack frame bna call stack me isliye O(n)

