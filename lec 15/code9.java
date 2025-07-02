

// Write a program to return a array of smallest and gretest

import java.util.*;

class code9{

static int[] arraycheck (int[] arr){
    Arrays.sort(arr);
    int[] ans = {arr[0],arr[arr.length-1]};
    return ans;
}

public static void main (String[]args){

 int []arr = new int[5];
    arr[0] = 0;
    arr[1] = 84;
    arr[2] = 5;
    arr[3] = 6;
    arr[4] = 9;

    int[] ans = arraycheck(arr);
    System.out.println("Smallest " + ans[0]);
    System.out.println("Largest " + ans[1]);

}

}