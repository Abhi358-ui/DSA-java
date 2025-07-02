import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age :");
        int age = sc.nextInt();

        if (age<12){
            System.out.println("it is child");
        }
        else if (age >=12 && age < 18){
            System.out.println("it is Teenager");

        }
        else{
            System.out.println("it is adult");

        }

        sc.close();
    }
    
}
