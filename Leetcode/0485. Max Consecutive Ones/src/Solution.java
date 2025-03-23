public class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0, counter = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) counter++;
            else{
                ans = Math.max(ans, counter);
                counter = 0;
            }
        }
        
        return Math.max(ans, counter);
    }
}
