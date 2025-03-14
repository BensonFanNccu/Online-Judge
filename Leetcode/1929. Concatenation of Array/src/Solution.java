public class Solution {
    public int[] getConcatenation(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        } 

        return ans;
    }
}