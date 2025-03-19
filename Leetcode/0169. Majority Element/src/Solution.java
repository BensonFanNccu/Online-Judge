public class Solution {
    public int majorityElement(int[] nums){
        /*
         * Boyer-Moore Voting Algorithm Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = nums[0], count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ans) count++;
            else count--;

            if(count <= 0) ans = nums[i];
        }

        return ans;
    }
}
