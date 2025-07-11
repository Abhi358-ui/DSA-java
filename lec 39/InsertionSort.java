

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {51,4,3,7,2};
        sorted(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void sorted(int[] arr){

        for (int i=1; i<arr.length; i++) {
            
            int j=i;
            while (j > 0 && arr[j] < arr[j-1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }
}



/*

--> Time complexity = Number of iteration * time taken in one call

Best case = O(n-1) because where the best case the while loop never run when the sorted array is given

wrost case = n^2




--> Space complexity = O(1) becasuse we are not use any extra array and space 


--> is insertion sort stable : yes

--> application of insertion sort 

   1. number of unsorted item is low
   2. some part of the array is already sorted
   








 */