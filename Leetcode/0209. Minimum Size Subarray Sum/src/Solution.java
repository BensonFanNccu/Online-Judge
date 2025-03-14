public class Solution {
    public int minSubArrayLen(int target, int[] nums){
        /*
         * Sliding Window Solution
         * Time: O(n)
         * Space: O(1)
         */

        int left = 0, sum = 0, ans = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            
            while(sum >= target){
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}
