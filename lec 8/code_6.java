//Given 2 numbers a and b Find a raise to the power b.

import java.util.Scanner;

public class code_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second  number : ");
        int b = sc.nextInt();

        int power = 1;

        while (b > 0) {
            power *= a;
            b--;
        }
        System.out.println(a + " raise to the power " + b + " = " + power);

        sc.close();
    }
}
