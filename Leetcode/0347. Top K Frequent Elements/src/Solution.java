import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Solution {
    public int[] topKFrequent(int[] nums, int k){
        /*
         * Priority Queue Solution
         * Time: O(k*LogN)
         * Space: O(N)
         */

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        PriorityQueue<int[]> pqueue = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
        int[] ans = new int[k];

        for(int num: nums) hm.put(num, hm.getOrDefault(num, 0) + 1);
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) pqueue.add(new int[] {entry.getKey(), entry.getValue()});
        for(int i = 0; i < k; i++) ans[i] = pqueue.poll()[0];

        return ans;
    }
}
