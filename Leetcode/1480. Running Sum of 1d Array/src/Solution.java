public class Solution {
    public int[] runningSum(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        for(int i = 1; i < nums.length; i++) nums[i] = nums[i - 1] + nums[i];

        return nums;
    }
}
