
// 1. Given an arrray n integers and a target value x. print whether x exists in the array or not.

public class linerSearch {
    
    public static void main(String[] args) {
        int[] arr = {11};
        SeachArr(arr,11,0);
    }

    static void SeachArr(int[] arr,int target,int idx)
    {
        // base case 
        if(arr.length == idx)
        {
            System.out.println("no");
            return;
        }

        // self work
        if(arr[idx]==target)
        {
            System.out.println("yes");
            return;
        }

        // recursive work
        SeachArr(arr,target,idx+1);
    }
}

/*

Time Complexity :>
==> O(n) where n is the number of element in the array

Space Complexity :>
==> O(n) where n is the number of element in the array and n stack frame is created

 */