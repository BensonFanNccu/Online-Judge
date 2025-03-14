public class Solution {
    public int singleNumber(int[] nums){
        /*
         * Bitwise Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0;

        for(int i : nums) ans ^= i;

        return ans;
    }
}
