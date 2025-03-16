public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array nums of n integers, return an array of all the unique quadruplets 
         * [nums[a], nums[b], nums[c], nums[d]] such that:
         * 1. 0 <= a, b, c, d < n
         * 2. a, b, c, and d are distinct.
         * 3. nums[a] + nums[b] + nums[c] + nums[d] == target
         * 
         * You may return the answer in any order.
         * 
         * Example:
         * Input: nums = [1,0,-1,0,-2,2], target = 0
         * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 0, -1, 0, -2, 2};
        int[] case2 = new int[] {2, 2, 2, 2, 2};

        System.out.println(sol.fourSum(case1, 0));
        System.out.println(sol.fourSum(case2, 8));
    }
}
