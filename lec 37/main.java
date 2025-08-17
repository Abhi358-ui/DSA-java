
// Bubble sort

public class main {
    
    public static void main(String[] args) {
        
        int []arr ={7,6,-5,4,3,2,33,-22,1,2};
        sorted(arr); // method call
        
        // print the array
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }

    static void sorted(int[] arr){

        for(int i=0; i<arr.length-1; i++)
        {
            boolean flag = false; // has any swapping happend??
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag= true;
                }
            }

            if(flag == false) // check if swap then continue otherwise return;
            {
                return;
            }
        }

    }
}

/*


*** Space complexity -> here we are not use any additions space comonly used small variables so the time complexity are 

==> O(1)


*** Time Complexity

==> no of call in one array the outer loop is n-1 and inner loop is n-i-1 that is also prefferd to n so n*n loop is continue


*** Time complexity of bubble sort ***

Best case = O(n)
Wrost case = O(n*n)
Average case = O(n*n)



 */