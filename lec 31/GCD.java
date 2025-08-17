

// Given two number x and y. Find the gretest common factor of x and y using recursion

public class GCD {
    
    public static void main(String[] args) {

        System.out.println(findGCD(12,16));
     
    }



    // long division method
    // static int findGCD(int x, int y)
    // {
    //     int divisor=Math.min(x,y);
    //     int dividend=Math.max(x,y);

    //     while (dividend%divisor!=0) {
    //         int div=divisor;
    //         divisor=dividend%divisor;
    //         dividend=div;

    //     }

    //     return divisor;
    // }



    // in recursion and Euclid algoriyhm

    static int findGCD(int x, int y)
    {
        if (y==0) 
        {
            return x;
        }

        return findGCD(y,x%y);
    }



    // static int findGCD(int n,int m)
    // {
    //     int min=Math.min(n,m);
    //     int ans=0;
    //     for(int i=min; i>=1; i--)
    //     {
    //         if(n%i==0 && m%i==0)
    //         {
    //             ans=i;
    //             break;
    //         }
    //     }

    //     return ans;
    // }
}