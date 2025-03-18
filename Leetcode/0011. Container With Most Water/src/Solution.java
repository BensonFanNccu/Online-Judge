public class Solution {
    public int maxArea(int[] height){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */

        int left = 0, right = height.length - 1, ans = 0, water = 0;

        while(left < right){
            water = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(water, ans);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return ans;
    }
}
