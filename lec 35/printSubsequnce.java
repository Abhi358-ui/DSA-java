
// 2. Given a String print all the subsequences

public class printSubsequnce {
    
    public static void main(String[] args) {
        printSSQ("abcd","");
    }

    static void printSSQ(String s,String CurrAns)
    {
        // base case
        if(0 == s.length())
        {
            System.out.println(CurrAns);
            return;
        }

        //self work
        char curr = s.charAt(0);
        String remStr = s.substring(1);

        // recursive work
        printSSQ(remStr,CurrAns+curr);
        printSSQ(remStr,CurrAns);


    }
}