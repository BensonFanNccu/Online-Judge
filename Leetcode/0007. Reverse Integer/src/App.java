public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a signed 32-bit integer x, return x with its digits reversed. 
         * If reversing x causes the value to go outside the signed 32-bit integer 
         * range [-2^31, 2^31 - 1], then return 0.
         * 
         * Example:
         * Input: x = 123
         * Output: 321
         */
        
        Solution sol = new Solution();

        int case1 = -123;
        int case2 = 120;

        System.out.println(sol.reverse(case1));
        System.out.println(sol.reverse(case2));
    }
}
