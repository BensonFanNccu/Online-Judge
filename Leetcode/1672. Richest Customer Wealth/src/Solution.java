public class Solution {
    public int maximumWealth(int[][] accounts){
        /*
         * Straight Forward Solution
         * Time: O(M*N)
         * Space: O(1)
         */
        
        int sum, max = 0;

        for(int i = 0; i < accounts.length; i++){
            sum = 0;

            for(int w : accounts[i]) sum += w;

            if(sum > max) max = sum;
        }

        return max;
    }
}
