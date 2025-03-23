public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array of integers nums containing n + 1 integers where each integer is in 
         * the range [1, n] inclusive.
         * There is only one repeated number in nums, return this repeated number.
         * 
         * You must solve the problem without modifying the array nums and 
         * using only constant extra space.
         * 
         * Example:
         * Input: nums = [1,3,4,2,2]
         * Output: 2
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 3, 4, 2, 2};
        int[] case2 = new int[] {3, 3, 3, 3, 3};

        System.out.println(sol.findDuplicate(case1));
        System.out.println(sol.findDuplicate(case2));
    }
}
