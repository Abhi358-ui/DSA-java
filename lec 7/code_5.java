import java.util.Scanner;

public class code_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();
        int sum =0;

        while(num !=-1){
            sum = sum+num;
            num = sc.nextInt();
        }
        System.out.println("the sum is : "+sum);
        sc.close();
    }
    
}
