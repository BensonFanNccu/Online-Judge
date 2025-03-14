public class Solution {
    public int reverse(int x){
        /*
         * Remainder Solution
         * Time: O(logN)
         * Space: O(1)
         */
        
        long ans = 0;

        while(x != 0){
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        if(ans < Integer.MAX_VALUE && ans > Integer.MIN_VALUE) return (int)ans;

        return -1;
    }
}
