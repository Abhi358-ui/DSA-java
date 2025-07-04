

// Print the max value of the array [3,10,3,4,5]


public class findMaxarray {
    
    public static void main(String[] args) {
        int[] arr={11,7,544,74,58,88};
        System.out.println(findMaxInArry(arr,0));

    }

    static int findMaxInArry(int []arr,int n)
    {

        // base case
        if(n==arr.length-1)
        {
            return arr[n];
        }

        // self work --> Math.max()
        return Math.max(findMaxInArry(arr,n+1),arr[n]);
    }
}


/*

Time Complexity of this program

--> time taken in one call and

--> total number of call*one call time taken

--> Time complexity ==> O(n)


{because remain of function call are constant operation}
 */