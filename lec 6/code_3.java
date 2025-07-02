
import java.util.Scanner;


public class code_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if (num%2==0){
            if(num%3==0){
                System.out.println("the number is even and divisiable by 3");

            }
            else{
                System.out.println("the number is even but not divisiable by 3");
            }
        }
        else{
            System.out.println("the number is odd");
        }
        
        sc.close();
    }
}
