public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer n, return true if it is a power of three. Otherwise, return false.
         * An integer n is a power of three, if there exists an integer x such that n == 3^x.
         * 
         * Example:
         * Input: n = 27
         * Output: true
         * Explanation: 27 = 33
         */
        
        Solution sol = new Solution();

        System.out.println(sol.isPowerOfThree(81));
        System.out.println(sol.isPowerOfThree2(243));
        System.out.println(sol.isPowerOfThree(56));
    }
}
