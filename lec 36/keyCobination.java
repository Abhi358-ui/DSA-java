
// Given a string containing digit from 2-9 inclusive return all the possiable letter combinations that the number could represent. return the answer in any order

/*
input : digit : "23"
output : "ad", "ac", "af", "bd", "bc", "bf", "cd", "cc", "cf"
 */


public class keyCobination {
    
    public static void main(String[] args) {
        String s = "234";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combination(s,kp,"");
        
    }

    static void combination(String dig, String[] kp, String res)
    {
        // base case
        if(dig.length() == 0)
        {
            System.out.print(res+ " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i=0; i<currChoices.length(); i++)
        {
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }
}

/*

Time Comelxity = no of call * time taken in one call

no of call => 4^n

time taken in one call = 4*2n = 4*n => n here 4 and 2 is a constant operation

****
Overall time complexity ==> O(4*n^4)

 */