public class Solution {
    public boolean isPowerOfFour(int n){
        /*
         * Recursion Solution
         * Time: O(LogN)
         * Space: O(1)
         */

        if(n == 1) return true;
        if(n == 0 || n % 4 != 0) return false;

        return isPowerOfFour(n / 4);
    }


    public boolean isPowerOfFour2(int n){
        /*
         * Bitwise Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        if(n < 1) return false;
        if((n & n - 1) != 0) return false;
        if((n & 0xaaaaaaaa) != 0) return false;

        return true;
    }
}