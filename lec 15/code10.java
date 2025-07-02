

// Write a program to return a array of smallest and gretest

import java.util.*;

class code10{

static int[ ] arraysmall(int[] arr){
    Arrays.sort(arr);
    int []ans;
   for (int i =0; i<arr.length; i++){
   ans[i] = arr[i];
   }
    return ans;
}

static void printarray(int []arr){
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
}

public static void main (String[]args){

 int []arr = new int[5];
    arr[0] = 0;
    arr[1] = 84;
    arr[2] = 5;
    arr[3] = 6;
    arr[4] = 9;

    int[] ans = arraysmall(arr);
    printarray(ans);
    
   
}

}