
// 2. find last index of target in arr

public class followup2 {
    
    public static void main(String[] args) {
        int[] arr = {111,21,11,1,3,4,1,22};
        System.out.println(chekIndex(arr,3,arr.length-1));
    }

    static int chekIndex(int[] arr, int target,int idx)
    {
        if(0 > idx)
        {
            return -1;
        }

        if(arr[idx] == target)
        {
            return idx;
        }

        return chekIndex(arr,target,idx-1);

    }
}