
//  Given an integer array arr, move all the 0's to the end of it while maintaining the realtive order of non zero element


public class ZeroAtLast {
    
    public static void main(String[] args) {
        
        int[] arr = {0,5,0,0};
        sorted(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void sorted(int[] arr)
    {
        for (int i=0; i<arr.length-1; i++) {
            boolean flag = false;

            for (int j=0; j<arr.length-i-1; j++) {

                if( arr[j] == 0 && arr[j+1] != 0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    flag=true;

                }
                
            }

            if(flag == false)
            {
                return;
            }
        }
    }
}