import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> fizzBuzz(int n){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<String> ans = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            if(i % 15 == 0) ans.add("FizzBuzz");
            else if(i % 3 == 0) ans.add("Fizz");
            else if(i % 5 == 0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
        }

        return ans;
    }
}
