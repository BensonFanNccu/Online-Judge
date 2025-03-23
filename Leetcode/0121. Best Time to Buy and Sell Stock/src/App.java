public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an array prices where prices[i] is the price of a given stock on the ith day.
         * 
         * You want to maximize your profit by choosing a single day to 
         * buy one stock and choosing a different day in the future to sell that stock.
         * 
         * Return the maximum profit you can achieve from this transaction. 
         * If you cannot achieve any profit, return 0.
         * 
         * Example:
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {7, 1, 5, 3, 6, 4};
        int[] case2 = new int[] {7, 6, 4, 3, 1};

        System.out.println(sol.maxProfit(case1));
        System.out.println(sol.maxProfit(case2));
    }
}
