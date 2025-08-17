
//  Return the count of digit in a given number n


public class countOfDigit {
    
    public static void main(String[] args) {
        System.out.println(CountD(1212));

    }

    static int CountD(int n)
    {
        if(n>=0 && n<=9)
        {
            return 1;
        }

        return CountD(n/10)+1;
    }
}