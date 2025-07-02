
//While loop

import java.util.Scanner;

public class code_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int num=1;
        int sum=0;

        while(num<=n){
            // System.out.println(num);
            sum+=num;  // sum=sum+num;
            num++;
        }
        System.out.println("the sum is :"+sum);
        sc.close();
    }
}
