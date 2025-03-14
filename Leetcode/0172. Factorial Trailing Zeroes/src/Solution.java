public class Solution {
    public int trailingZeroes(int n){
        /*
         * Math Solution
         * Time: O(LogN)
         * Space: O(1)
         */
        
        int ans = 0;

        while(n != 0){
            n /= 5;
            ans += n;
        }

        return ans;
    }
}
