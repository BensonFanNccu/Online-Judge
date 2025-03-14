import java.util.Arrays;


public class Solution {
    public int[] sortedSquares(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N*LogN)
         * Space: O(N)
         */

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) ans[i] = nums[i] * nums[i];

        Arrays.sort(ans);
        return ans;
    }


    public int[] sortedSquares2(int[] nums){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1;

        for(int i = right; i >= 0; i--){
            if(nums[right] * nums[right] >= nums[left] * nums[left]){
                ans[i] = nums[right] * nums[right];
                right--;
            }else{
                ans[i] = nums[left] * nums[left];
                left++;
            }
        }

        return ans;
    }
}
