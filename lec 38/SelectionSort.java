
public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {-122,431,22,12,44,3};
       
       sorting(arr);
       for(int i=0; i<arr.length; i++)
       {
        System.out.println(arr[i]);
       }
    }

    static int[] sorting(int[] arr)
    {

        
        for (int i=0; i<arr.length; i++) { // i reprsesent current index
        int min=i;

            for(int j=i+1; j<arr.length; j++)
            {
                 if(arr[j]<arr[min]){
                    min=j;
                 }
            
            }

            // swap current element and minimal element
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        return arr; 


    }
}



/*

--> Space complexity =O(1) because we are not used any extra space array is sorted in inplace array


--> Time complexity = O(n)


--> selection sort is not a stable sort techniques 

Example : 4, 10, 4*, 2
          2, 10, 4*, 4
          2, 4*, 10, 4
          2, 4*, 4, 10



--> selection sort is a inplace sorting techniques because array is not required any extra spaces

 */