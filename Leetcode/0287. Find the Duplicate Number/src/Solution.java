public class Solution {
    public int findDuplicate(int[] nums){
        /*
         * Floyd's Tortoise and Hare Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int fast = nums[0], slow = nums[0];

        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);

        slow = nums[0];

        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }

        return fast;
    }
}
