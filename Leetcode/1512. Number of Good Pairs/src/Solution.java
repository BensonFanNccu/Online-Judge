import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int numIdenticalPairs(int[] nums){
        /*
         * Straight Forward Solution
         * Time: O(N^2)
         * Space: O(1)
         */

        int ans = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) ans++;
            }
        }

        return ans;
    }


    public int numIdenticalPairs2(int[] nums){
        /*
         * HashMap Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])) ans += hm.get(nums[i]);

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        return ans;
    }
}
