
public class ReverseDigit {
    public static void main(String[] args) {
        int n = 12214;

        int res = 0;
        while (n != 0) {
          int lastDigit = n % 10;
          res = res * 10 + lastDigit;
          n /= 10;
        }

        System.out.println(res);
    }
}