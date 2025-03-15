import java.util.HashSet;
import java.util.Set;


public class Solution {
    public boolean isHappy(int n){
        /*
         * HashSet Solution
         * Time: O(LogN)
         * Space: O(LogN)
         */

        Set<Integer> hs = new HashSet<Integer>();
        
        while(n != 1 && !hs.contains(n)){
            hs.add(n);
            n = nextIter(n);
        }

        return n == 1;
    }


    public int nextIter(int n){
        int res = 0;

        while(n > 0){
            int temp = n % 10;

            res += temp * temp;
            n /= 10;
        }

        return res;
    }


    public boolean isHappy2(int n){
        /*
         * Math Solution
         * Time: O(LogN)
         * Space: O(LogN)
         */
        
        if(n == 1 || n == 7) return true;
        if(n < 10) return false;

        int sum = 0;
        
        while(n > 0){
            int temp = n % 10;

            sum += temp * temp;
            n /= 10;
        }

        return isHappy2(sum);
    }
}
