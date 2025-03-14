public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a non-empty array of integers nums, every element appears twice except for one. 
         * Find that single one.
         * 
         * You must implement a solution with a linear runtime complexity 
         * and use only constant extra space.
         * 
         * Example:
         * Input: nums = [2,2,1]
         * Output: 1
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {2, 2, 1};
        int[] case2 = new int[] {4, 1, 2, 1, 2};
        int[] case3 = new int[] {1};

        System.out.println(sol.singleNumber(case1));
        System.out.println(sol.singleNumber(case2));
        System.out.println(sol.singleNumber(case3));
    }
}
