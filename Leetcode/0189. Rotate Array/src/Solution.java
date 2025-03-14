import java.util.Arrays;


public class Solution {
    public void rotate(int[] nums, int k){
        /*
         * Modulo Solution
         * Time: O(N)
         * Space: O(N)
         */

        int[] ans = new int[nums.length];
        k = k % nums.length;

        for(int i = k; i < nums.length; i++) ans[i] = nums[i - k];
        for(int i = 0; i < k; i++) ans[i] = nums[nums.length - k + i];

        for(int i = 0; i < nums.length; i++) nums[i] = ans[i];

        System.out.println(Arrays.toString(nums));
    }


    public void rotate2(int[] nums, int k){
        /*
         * Reverse Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }


    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
}
