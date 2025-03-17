public class Solution {
    public boolean divideArray(int[] nums){
        /*
         * Hash Table Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        int[] hash = new int[501];

        for(int num: nums) hash[num]++;
        for(int num: hash){
            if((num & 1) != 0) return false;
        }

        return true;
    }
}
