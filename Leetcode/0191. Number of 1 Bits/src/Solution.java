public class Solution {
    public int hammingWeight(int n){
        /*
         * Division Solution
         * Time:O(LogN)
         * Space: O(1)
         */
        
        int ans = 0;

        while(n != 0){
            if(n % 2 == 1) ans++;
            
            n /= 2; 
        }

        return ans;
    }


    public int hammingWeight2(int n){
        /*
         * Bitwise Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        int ans = 0;

        while(n != 0){
            ans += n & 1;
            n = n >>> 1;
        }

        return ans;
    }
}
