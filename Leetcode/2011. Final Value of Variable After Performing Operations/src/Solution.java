public class Solution {
    public int finalValueAfterOperations(String[] operations){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0;

        for(String op : operations){
            if(op.charAt(1) == '+') ans++;
            else ans--;
        }

        return ans;
    }
}
