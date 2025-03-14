public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are climbing a staircase. It takes n steps to reach the top.
         * 
         * Each time you can either climb 1 or 2 steps. 
         * In how many distinct ways can you climb to the top?
         * 
         * Example:
         * Input: n = 2
         * Output: 2
         * Explanation: 
         * There are two ways to climb to the top.
         * 1. 1 step + 1 step
         * 2. 2 steps
         */
        
        Solution sol = new Solution();

        int case1 = 3;
        int case2 = 10;
        int case3 = 45;

        System.out.println(sol.climbStairs(case1));
        System.out.println(sol.climbStairs2(case2));
        System.out.println(sol.climbStairs3(case3));
    }
}
