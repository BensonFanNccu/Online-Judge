public class Solution {
    public int scoreOfString(String s){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int ans = 0;
        char prev = s.charAt(0);

        for(char c : s.toCharArray()){
            ans += Math.abs(c - prev);
            prev = c;
        }

        return ans;
    }
}
