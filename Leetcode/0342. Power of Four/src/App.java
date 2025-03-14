public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer n, return true if it is a power of four. Otherwise, return false.
         * An integer n is a power of four, if there exists an integer x such that n == 4^x.
         * 
         * Example:
         * Input: n = 16
         * Output: true
         */
        
        Solution sol = new Solution();

        System.out.println(sol.isPowerOfFour(2));
        System.out.println(sol.isPowerOfFour(3));
        System.out.println(sol.isPowerOfFour(4));
    }
}
