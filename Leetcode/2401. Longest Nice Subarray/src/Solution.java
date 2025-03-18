public class Solution {
    public int longestNiceSubarray(int[] nums){
        /*
         * Sliding Window
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 1, left = 0, usedbit = 0;

        for(int right = 0; right < nums.length; right++){
            while((usedbit & nums[right]) != 0){
                usedbit ^= nums[left];
                left++;
            }

            usedbit |= nums[right];
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
