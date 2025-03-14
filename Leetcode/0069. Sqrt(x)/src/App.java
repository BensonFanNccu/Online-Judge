public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a non-negative integer x, return the square root of x rounded down to 
         * the nearest integer. The returned integer should be non-negative as well.
         * 
         * You must not use any built-in exponent function or operator.
         * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
         * 
         * Example:
         * Input: x = 8
         * Output: 2
         * Explanation: 
         * The square root of 8 is 2.82842..., and since we 
         * round it down to the nearest integer, 2 is returned.
         */
        
        Solution sol = new Solution();

        System.out.println(sol.mySqrt(4));
        System.out.println(sol.mySqrt2(8));
    }
}
