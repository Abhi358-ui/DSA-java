
// 1. implements isSorted() method -> given an array and check the array is sorted or not if array is sorted then print yes otherwise no

// ex -> [1,2,3,4] ==> yes




public class followUp {
    public static void main(String[] args) {
        int[] arr = {-1,1,3,3,4,5};
        chekcSort(arr,0);
    }

    static void chekcSort(int[] arr,int idx)
    {
        if(arr.length-1 == idx)
        {
            System.out.println("sorted");
            return;
        }

        if(!(arr[idx] <= arr[idx+1])) {
            System.out.println("not sorted");
            return;
        }

        chekcSort(arr,idx+1);

    }
}