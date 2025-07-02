//Reverse the digit of a number

import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");

        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("the reverse is " + rev);
        sc.close();
    }
}
