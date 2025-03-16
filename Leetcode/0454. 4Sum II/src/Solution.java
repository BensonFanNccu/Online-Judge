import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        /*
         * HashMap Solution
         * Time: O(N^2)
         * Space: O(N^2)
         */

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ans = 0, sum = 0;

        for(int num1: nums1){
            for(int num2: nums2){
                sum = num1 + num2;
                hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            }
        }

        for(int num3: nums3){
            for(int num4: nums4){
                ans += hm.getOrDefault(0 - num3 - num4, 0);
            }
        }

        return ans;
    }
}
