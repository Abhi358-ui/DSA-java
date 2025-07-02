//Find the sum of the following series 

import java.util.Scanner;

public class code_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter a num :");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s -= i;
            } else {
                s += i;
            }
        }
        System.out.println("the sum is " + s);
        sc.close();
    }
}
