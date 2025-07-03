
// Given a number n. Find the sum of natural numbers till n but with alternate sign

// That means if n=5 then you have to return 1-2+3-4+5=3 as your answer


public class sumOfNatural {
    
    public static void main(String[] args) {

        // function call
        System.out.println(findSum(10));
        
    }


    static int findSum(int n)
    {
        int sum=0;

        // base case
        if(n==0){
            return 0;
        }

        // recursive work based on condition
        if(n%2==0){
            // self work
            sum=findSum(n-1)-n;
        }
        else{
            sum=findSum(n-1)+n;
        }


        return sum;
    }
}


// number of recursive call is based on n 
// and other all operation inside loop ar constant c

// so Time comeplexity is O(n*c) but here c is constant so ignore this 

// and finnaly Time COomplexity is ==> O(n)

// Modern machine me 1 sec = 10^8 operation

