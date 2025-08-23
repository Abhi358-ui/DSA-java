import java.util.Scanner;

public class code_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int num = sc.nextInt();
        System.out.println();

        // if (num%2 ==0)
        // {
        // System.out.println("Number is even");
        // }
        // else{
        // System.out.println("Number is odd");



        //Ternary Operator

        String ans;

        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);

        sc.close();
    }
}
