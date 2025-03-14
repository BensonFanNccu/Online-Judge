public class Solution {
    public boolean isPowerOfThree(int n){
        /*
         * Recursion Solution
         * Time: O(LogN)
         * Space: O(1)
         */

        if(n == 1) return true;
        if(n == 0 || n % 3 != 0) return false;

        return isPowerOfThree(n / 3);
    }


    public boolean isPowerOfThree2(int n){
        /*
         * Math Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        return n > 0 && 1162261467 % n == 0;
    }
}
