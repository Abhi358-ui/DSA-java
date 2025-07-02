//find the sum of digits in a given number n

import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int sum =0;
        while(num>0){
            int res=num%10;
            num=num/10;
            sum +=res;
        }
        System.out.println("The sum is "+ sum);
        sc.close();
    
    }
}
