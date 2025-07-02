//Print the first n factorial number 

import java.util.Scanner;

public class code_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println("Factorial of " + i + " is = " + fact);
        }

        sc.close();
    }
}
