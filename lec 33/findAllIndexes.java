
// find all the indexex of the array where the target element is present and return an array of that indices
import java.util.*;
public class findAllIndexes {
    
    public static void main(String[] args) {
        
        int[] arr = {11,22,1,22,32,44};
        ArrayList<Integer> ans = allIndex(arr,22,0);
        System.out.println(ans);
    }

    static ArrayList<Integer>  allIndex(int[] arr,int target, int idx)
    {
        // base case
        if(arr.length == idx) // if array are empty
        {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        // self work
        if(arr[idx] == target) 
        {
            ans.add(idx);
        }

        // recursive work
      ArrayList<Integer> smallans =  allIndex(arr,target,idx+1);

      ans.addAll(smallans);
      return ans;
    }
}