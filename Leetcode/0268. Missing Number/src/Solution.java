public class Solution {
    public int missingNumber(int[] nums){
        /*
         * Math Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int n = nums.length;
        int ans = (1 + n) * n / 2;

        for(int num: nums) ans -= num;

        return ans;
    }
}
