import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Principle amount :");
        float principle = sc.nextFloat();

        System.out.print("Enter the rate of interst :");
        float rate = sc.nextFloat();

        System.out.print("Enter the time :");
        float time =sc.nextFloat();

        float ci = (principle*rate*time
        )/100;

        System.out.println("the compound intersest is "+ ci);

        sc.close();
    }
    
}
