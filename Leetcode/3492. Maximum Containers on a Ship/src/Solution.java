public class Solution {
    public int maxContainers(int n, int w, int maxWeight){
        /*
         * Math Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        return Math.min(n * n, maxWeight / w);
    }
}
