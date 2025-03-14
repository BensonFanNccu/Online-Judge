import java.util.Map;
import java.util.HashMap;


public class Solution {
    public int[] twoSum(int[] nums, int target){
        /*
         * HashMap Solution
         * Time: O(N)
         * Space: O(N)
         */

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)) return new int[] {map.get(complement), i};

            map.put(nums[i], i);
        }

        return new int[] {};
    }


    public int[] twoSum2(int[] nums, int target){
        /*
         * Brute Force Solution
         * Time: O(N^2)
         * Space: O(1)
         */
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {nums[i], nums[j]};
            }
        }

        return new int[] {};
    }
}
