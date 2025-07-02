
// Check if the array is sorted or not

class code8{

static boolean checksort(int[] arr){

    boolean check = true;

    for (int i=1; i<arr.length; i++){
        if (arr[i] < arr[i-1]){
            check = false;
            break;
        }
    }
    return check;
}

public static void main (String[]args){

    int []arr = new int[5];
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 5;
    arr[3] = 6;
    arr[4] = 9;

    System.out.print("Is sorted : "+ checksort(arr));
}

}