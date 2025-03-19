public class App {
    public static void main(String[] args) throws Exception {
        /*
         * There exists an infinitely large two-dimensional grid of uncolored unit cells. 
         * You are given a positive integer n, indicating that you must do the 
         * following routine for n minutes:
         * 1. At the first minute, color any arbitrary unit cell blue.
         * 2. Every minute thereafter, color blue every uncolored cell that touches a blue cell.
         * 
         * Example:
         * Input: n = 2
         * Output: 5
         */
        
        Solution sol = new Solution();

        int case1 = 2;
        int case2 = 10;

        System.out.println(sol.coloredCells(case1));
        System.out.println(sol.coloredCells(case2));
    }
}
