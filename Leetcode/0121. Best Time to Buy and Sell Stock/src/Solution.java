public class Solution {
    public int maxProfit(int[] prices){
        /*
         * Greedy Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0, lowest = Integer.MAX_VALUE;

        for(int price: prices){
            lowest = Math.min(lowest, price);
            ans = Math.max(ans, price - lowest);
        }

        return ans;
    }
}
