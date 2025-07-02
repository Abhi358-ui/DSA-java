//Count the number of digit for a given number

import java.util.Scanner;

public class code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            n = n / 10;
            sum++;
        }
        System.out.println("The digit is " + sum);

        sc.close();
    }
}
