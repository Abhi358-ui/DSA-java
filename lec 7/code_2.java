import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0;

        for (int num=1; num<=n; num++)
        {
            // System.out.println(num);
            sum=sum+num;

        }
        System.out.println("The sum is :"+sum);
    }
    
}
