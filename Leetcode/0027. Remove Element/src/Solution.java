public class Solution {
    public int removeElement(int[] nums, int val){
        /*
         * Straight Forward Solution
         * Time: O(N^2)
         * Space: O(1)
         */

        int ans = nums.length;

        for(int i = 0; i < ans; i++){
            if(nums[i] == val){
                for(int j = i + 1; j < nums.length; j++){
                    nums[j - 1] = nums[j];
                }

                i--;
                ans--;
            }
        }

        return ans;
    }


    public int removeElement2(int[] nums, int val){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int slow = 0;

        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
