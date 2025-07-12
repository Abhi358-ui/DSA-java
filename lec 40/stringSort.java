
// Given an array of the fruits; you are supposed to sort it in lexicographical (dictonary) order using the selection sort


public class stringSort {
    
    public static void main(String[] args) {

        String[] arr = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        moveString(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        
    }

    static void moveString(String[] arr)
    {

        for (int i=0; i<arr.length-1; i++) {
            int min = i;

            for (int j=i+1; j<arr.length; j++ ) {

                if(arr[j].compareTo(arr[min]) < 0)
                {
                    min=j;
                }
                
            }

            String temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


            
        }
    }

}