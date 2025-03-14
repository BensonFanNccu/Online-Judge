public class Solution {
    public int[] buildArray(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) ans[i] = nums[nums[i]];

        return ans;
    }


    public int[] buildArray2(int[] nums){
        /*
         * Cache Solution
         * Time: O(N)
         * Space: O(1)
         */

        for(int i = 0; i < nums.length; i++) nums[i] += (nums[nums[i]] % nums.length) * nums.length;
        for(int i = 0; i < nums.length; i++) nums[i] /= nums.length;

        return nums;
    }


    public int[] buildArray3(int[] nums){
        /*
         * Bitwise Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        for(int i = 0; i < nums.length; i++) nums[i] |= (nums[nums[i]] & 1023) << 10;
        for(int i = 0; i < nums.length; i++) nums[i] = nums[i] >> 10;

        return nums;
    }
}
