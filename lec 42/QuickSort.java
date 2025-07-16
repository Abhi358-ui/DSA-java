
public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr = {6,1,3,2,4};
        sorted(arr,0,arr.length-1);
        printArray(arr);
    }

    static void sorted(int[] arr, int srart, int end)
    {

        if(srart >= end)
        {
            return;
        }

        int pi = partition(arr,srart,end);
        sorted(arr,srart,pi-1);
        sorted(arr,pi+1,end);

    }


    // partition method
    static int partition(int[] arr, int srart, int end)
    {
        int pivot=arr[srart];
        int count=0;

        for (int i=srart+1; i<=end; i++ ) {
            if(pivot >= arr[i])
            {
                count++;
            }
        }

        int pivotIdx = srart + count;
        swap(arr,srart,pivotIdx);

        int i=srart, j=end;


        // element lesser and equal are shift as the left side and greter elemeent are placed at the right side
        while (i< pivotIdx && j> pivotIdx) {
            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] >= pivot) {
                j--;
            }

            if(i<pivotIdx && j> pivotIdx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }

        }




        return pivotIdx;

    }


    // print array function
    static void printArray(int[] arr)
    {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
    }

    // swap the element function
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
}