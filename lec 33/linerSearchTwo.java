
// 1. Given an arrray n integers and a target value x. return the indexex whether x exists in the array or not.


public class linerSearchTwo {
    
    public static void main(String[] args) {
        int[] arr = {11,21,33,23,43,444};
        System.out.println(SeachArr(arr,444,0));

    }

    static int SeachArr(int[] arr,int target,int idx)
    {
        // base case 
        if(arr.length == idx)
        {
            return -1;
        }

        // self work
        if(arr[idx]==target)
        {
            return idx;
        }

        // recursive work
        return SeachArr(arr,target,idx+1);
    }
}


