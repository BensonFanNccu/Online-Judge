public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array of positive integers nums and a positive integer target, 
         * return the minimal length of a subarray whose sum is greater than or equal to target.
         * If there is no such subarray, return 0 instead.
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {2, 3, 1, 2, 4, 3};
        int[] case2 = new int[] {1, 4, 4};
        int[] case3 = new int[] {1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(sol.minSubArrayLen(7, case1));
        System.out.println(sol.minSubArrayLen(4, case2));
        System.out.println(sol.minSubArrayLen(11, case3));
    }
}
