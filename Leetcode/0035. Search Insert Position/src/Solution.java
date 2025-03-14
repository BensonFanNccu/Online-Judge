public class Solution {
    public int searchInsert(int[] nums, int target){
        /*
         * Binary Search Solution
         * Time: O(LogN)
         * Space: O(1)
         */

        return binarySearch(nums, 0, nums.length - 1, target);
    }


    public int binarySearch(int[] nums, int left, int right, int target){
        int mid = (left + right) / 2;

        if(left == right && target > nums[left]) return left + 1;
        if(left == right && target < nums[left]) return left;

        if(target == nums[mid]) return mid;
        if(target < nums[mid]) return binarySearch(nums, left, mid, target);
        if(target > nums[mid]) return binarySearch(nums, mid + 1, right, target);

        return -1;
    }


    public int searchInsert2(int[] nums, int target){
        /*
         * Linear Search Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) return i;
        }

        return nums.length;
    }
}
