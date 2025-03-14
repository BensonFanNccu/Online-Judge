public class Solution {
    public boolean isPowerOfTwo(int n){
        /*
         * Recursion Solution
         * Time: O(LogN)
         * Space: O(1)
         */

        if(n == 1) return true;
        if(n % 2 == 1 || n == 0) return false;

        return isPowerOfTwo(n / 2);
    }


    public boolean isPowerOfTwo2(int n){
        /*
         * Bitwise Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        if(n < 1) return false;

        return (n & n - 1) == 0;
    }
}