import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int num = n; num >= 0; num--) {
            System.out.print(num+"  ");

        }

        sc.close();
    }

}
