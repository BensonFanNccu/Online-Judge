public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
         * 
         * Example:
         * Input: x = 2.00000, n = 10
         * Output: 1024.00000
         */
        
        Solution sol = new Solution();

        System.out.println(sol.myPow(2.0, 10));
        System.out.println(sol.myPow(2.1, 3));
        System.out.println(sol.myPow(2.0, -2));
    }
}
