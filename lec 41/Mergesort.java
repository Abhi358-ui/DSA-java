

// Merge sort algorithm

public class Mergesort {


    public static void main(String[] args) {
        
        int []arr = {4,1,3,5,2,3,2,12,33};
        System.out.println("array before sorting :");
        displayArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array after sorting :");
        displayArray(arr);


    }

    // print the array
    static void displayArray(int[] arr)
    {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr , int l, int r)
    {

        // base case
        if(l>=r)
        {
            return;
        }

        // subprolem
        mergeSort(arr,l,((l+r)/2));
        mergeSort(arr,((l+r)/2)+1,r);

        // self work
        merge(arr,l,((l+r)/2),r);
    }


    static void merge(int[] arr,int l, int mid, int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i,j,k;

        for (i=0; i<n1; i++) {
            left[i]=arr[l+i];
        }

        for (j=0; j<n2; j++ ) {
            right[j]=arr[mid+1+j];   
        }

        i=0; j=0; k=l;

        // merge two sorted array
        while (i<n1 && j<n2) {
            if(left[i] <= right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
            
        }

        // remaining array is filled in the main array
        while (i<n1) {
            arr[k++]=left[i++];
        }

        while (j<n2) {
            arr[k++] = right[j++];
        }
    }
 
}



/*

T(n) it is a total time complexity of the above function

and there are two recursive call and their time comppexity are T(n/2) because they are call at the n/2 size of the array

lets 

    T(n) = T(n/2) + T(n/2) + n   where n is merge function that takes the liner time 

    Time complexity = O(n logn)



    *** Space complexity  *** 

    space complexity = no of stack frame + n where n is merge function call

    finally time complexity 

    ==> O(n)



 */