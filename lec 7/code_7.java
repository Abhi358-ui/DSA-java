public class code_7 {
    public static void main(String[] args) {

        // for (int num = 1; num <= 50; num++) {
        // if (num % 3 == 0) {
        // continue;
        // }
        // System.out.println(num);

        // }

        // Using while loop

        // int num=1;
        // while(num<=50){
        // if(num%3==0)
        // {
        // num++;
        // continue;
        // }
        // System.out.println(num);
        // num++;
        // }



        // Using label with break and continue keywords

        myloop :for (int num = 1; num <= 50; num++) {
            if (num % 3 == 0) {
                continue myloop;
            }
            System.out.println(num);

        }

    }

}
