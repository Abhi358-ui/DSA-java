
// Find the sum of the element of the array [2,3,5,20,1]

public class sumOfarray {
    public static void main(String[] args) {

        int[] arr = {4,7,8};
        System.out.println(calculateSum(arr,0));
        
    }


    static int calculateSum(int[] arr, int idx)
    {
        // base case 1
        if(arr.length==idx)
        {
            return 0;
        }

        // base case 2
        if(idx==arr.length-1)
        {
            return arr[idx];
        }

        // self work + recursive work
        return arr[idx]+calculateSum(arr,idx+1);
    }
}