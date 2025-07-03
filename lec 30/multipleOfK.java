
// Given a number num and a value k. print k multiples of num

public class multipleOfK {
    
    public static void main(String[] args) {

        printMultiple(4,5);
        
    }

    static void printMultiple(int num, int k)
    {
        // base case
        // if(k==0){
        //     return;
        // }

        // base case 2
        if (k==1) 
        {
            System.out.println(num*k);
            return;
        }
        
        // recursive work
        printMultiple(num,k-1);

        // self work
        System.out.println(num*k);


        
    }
}