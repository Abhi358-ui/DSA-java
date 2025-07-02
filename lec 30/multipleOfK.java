
// Given a number num and a value k. print k multiples of num

public class multipleOfK {
    
    public static void main(String[] args) {

        printMultiple(12,1);
        
    }

    static void printMultiple(int num, int k)
    {
        // base case
        if(k==0){
            return;
        }
        
        // 
        printMultiple(num,k-1);
        System.out.println(num*k);


        
    }
}