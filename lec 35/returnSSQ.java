
// 1. Given a string return all its subsequences in an arraylist
import java.util.*;

public class returnSSQ {
    
    public static void main(String[] args) {
        
        System.out.println(getSSQ("abc"));
    }

    static ArrayList<String> getSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();

        //base case
        if(s.length() == 0)
        {
            ans.add("");
            return ans;
        }


        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for (String ss : smallAns) 
        {
            ans.add(ss);
            ans.add( curr + ss);
        }

        
        return ans;
    }
}