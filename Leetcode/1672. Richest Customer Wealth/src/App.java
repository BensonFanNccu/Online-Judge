public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money 
         * the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
         * 
         * A customer's wealth is the amount of money they have in all their bank accounts. 
         * The richest customer is the customer that has the maximum wealth.
         * 
         * Example:
         * Input: accounts = [[1,5],[7,3],[3,5]]
         * Output: 10
         */
        
        Solution sol = new Solution();

        int[][] case1 = new int[][] {{1, 2, 3}, {3, 2, 1}};
        int[][] case2 = new int[][] {{1, 5}, {7, 3}, {3, 5}};
        int[][] case3 = new int[][] {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        System.out.println(sol.maximumWealth(case1));
        System.out.println(sol.maximumWealth(case2));
        System.out.println(sol.maximumWealth(case3));
    }
}
