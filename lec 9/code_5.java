import java.util.Scanner;

public class code_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");
        int r = sc.nextInt();

        for (int i = r; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
