
// 2. Program to find nth fibonacci number

// 0 1 1 2 3 5 8 13 21

public class fibonacci {
    
    public static void main(String[] args) {
        
        for (int i=0; i<=10; i++)
        {
            System.out.print(fibo(i)+" ");
        }
        System.out.println();

    }


    static int fibo(int n)
    {
        // base case 1
        if (n==0)
        {
            return 0; 
        }

        // base case 2
        if(n==1)
        {
            return 1;
        }

        // sub problems
        return fibo(n-1)+fibo(n-2); // self work
    }
}

// method call constant time operation hoti ha wo n pr dependent nhi hoti ha  