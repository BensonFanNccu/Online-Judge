public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a m x n grid filled with non-negative numbers, 
         * find a path from top left to bottom right, 
         * which minimizes the sum of all numbers along its path.
         * 
         * Example:
         * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
         * Output: 7
         * Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
         */

        Solution sol = new Solution();

        int[][] case1 = new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] case2 = new int[][] {{1, 2, 3}, {4, 5, 6}};

        System.out.println(sol.minPathSum(case1));
        System.out.println(sol.minPathSum(case2));
    }
}
