public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer n, return true if it is a power of two. Otherwise, return false.
         * An integer n is a power of two, if there exists an integer x such that n == 2^x.
         * 
         * Example:
         * Input: n = 16
         * Output: true
         * Explanation: 2^4 = 16
         */

        Solution sol = new Solution();

        System.out.println(sol.isPowerOfTwo(1));
        System.out.println(sol.isPowerOfTwo2(4));
        System.out.println(sol.isPowerOfTwo(7));
    }
}
