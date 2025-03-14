public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer num, return the number of steps to reduce it to zero.
         * 
         * In one step, if the current number is even, you have to divide it by 2, 
         * otherwise, you have to subtract 1 from it.
         * 
         * Example:
         * Input: num = 14
         * Output: 6
         */
        
        Solution sol = new Solution();

        System.out.println(sol.numberOfSteps(14));
        System.out.println(sol.numberOfSteps(8));
        System.out.println(sol.numberOfSteps(123));
    }
}
