public class Solution {
    public int climbStairs(int n){
        /*
         * Recursion Solution(TLE)
         * Time: O(2^n)
         * Space: O(1)
         */

        if(n == 1 || n == 2) return n;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    public int climbStairs2(int n){
        /*
         * DP solution
         * Time: O(n)
         * Space: O(n)
         */

        if(n == 1 || n == 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }


    public int climbStairs3(int n){
        /*
         * Fibonacci Number Solution
         * Time: O(n)
         * Space: O(1)
         */
        
        if(n == 1 || n == 2) return n;

        int first = 1, second = 2, third = 3;

        for(int i = 3; i <= n; i++){
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}
