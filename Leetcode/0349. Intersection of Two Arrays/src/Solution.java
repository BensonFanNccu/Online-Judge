import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        /*
         * HashSet Solution
         * Time: O(M+N)
         * Space: O(N)
         */
        
        Set<Integer> hs = new HashSet<Integer>();
        Set<Integer> ans = new HashSet<Integer>();

        for(int num: nums1) hs.add(num);
        for(int num: nums2){
            if(hs.contains(num)) ans.add(num);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
