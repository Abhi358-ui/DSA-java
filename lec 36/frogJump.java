
public class frogJump {
    
    public static void main(String[] args) {

        int[] h = {10, 30, 40, 20};
        System.out.println(best(h,h.length,0)); 
        
    }

    static int best(int[] h,int n,int idx)
    {
        // base case 1
        if(idx==n-1){
            return 0;
        }

        // recursive calls
        int opt1 = Math.abs(h[idx] - h[idx+1]) + best(h,n,idx+1);
        
        // base case 2
        if(idx==n-2){
            return opt1;
        }

        // recursive calls
        int opt2 = Math.abs(h[idx] - h[idx+2]) + best(h,n,idx+2);

        // self work
        return Math.min(opt1,opt2);
    }
}


/*

Time Complecity = number of calls * Time taken in one calls

number of calls = n ka square 2
Time taken in one calls = constant times

TC = n^2*c
TC = n^2


 */