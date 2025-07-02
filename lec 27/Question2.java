
// Write a program to print all natural number from n to 1 using recursion


import java.util.Scanner;
public class Question2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printing(n);
        
    }

    static void Printing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n); // n
        Printing(n-1); // n-1 ...... 1
        
    }


}