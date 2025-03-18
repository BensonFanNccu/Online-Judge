public class Solution {
    public int trap(int[] height){
        /*
         * Straight Forward Solution(TLE)
         * Time: O(N^2)
         * Space: O(1)
         */

        int ans = 0, size = height.length;

        for(int i = 1; i < size; i++){
            int leftMax = 0, rightMax = 0;

            for(int j = i; j >= 0; j--) leftMax = Math.max(leftMax, height[j]);
            for(int j = i; j < size; j++) rightMax = Math.max(rightMax, height[j]);

            ans += Math.min(leftMax, rightMax) - height[i];
        }

        return ans;
    }


    public int trap2(int[] height){
        /*
         * Memorization Solution
         * Time: O(N)
         * Space: O(N)
         */

        int ans = 0, size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        leftMax[0] = height[0];
        rightMax[size - 1] = height[size - 1];

        for(int i = 1; i < size; i++) leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        for(int i = size - 2; i > 0; i--) rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        for(int i = 1; i < size - 1; i++) ans += Math.min(leftMax[i], rightMax[i]) - height[i];

        return ans;
    }


    public int trap3(int[] height){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0, left = 0, right = height.length - 1, leftMax = 0, rightMax = 0;

        while(left < right){
            if(height[left] < height[right]){
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax - height[left];
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];
                right--;
            }
        }

        return ans;
    }
}
