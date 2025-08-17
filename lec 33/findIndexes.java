
// 2. Given an array arr of size N and a target value x. The task is to find all the indices of the integer X in the array

public class findIndexes {
    
    public static void main(String[] args) {
        int[] arr = {9,8,8,8};
        findInx(arr,8,0);
    }


    static void findInx(int[] arr,int target,int idx)
    {
        if(arr.length == idx)
        {
            return;
        }

        if(arr[idx] == target )
        {
            System.out.println(idx);
        }

        findInx(arr,target,idx+1);
    }
}