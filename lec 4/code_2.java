import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers :");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("The sum of two number is "+ sum);

        sc.close();
    }
    
}
