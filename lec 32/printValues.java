
// Given an array print all its values recursively

public class printValues {
    
    public static void main(String[] args) {
        int []arr={12,34,51,23,43};
        prints(arr,0); // function calling
    }

    static void prints(int []arr,int idx)
    {
        // base case
        if(idx==arr.length)
        {
            return;
        }

        // self work
        System.out.println(arr[idx]);

        // recursive work
        prints(arr,idx+1);
    }
}