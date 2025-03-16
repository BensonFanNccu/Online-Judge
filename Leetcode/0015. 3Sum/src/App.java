public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
         * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
         * 
         * Notice that the solution set must not contain duplicate triplets.
         * 
         * Example:
         * Input: nums = [-1,0,1,2,-1,-4]
         * Output: [[-1,-1,2],[-1,0,1]]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {-1, 0, 1, 2, -1, -4};
        int[] case2 = new int[] {0, 1, 1};

        System.out.println(sol.threeSum(case1));
        System.out.println(sol.threeSum(case2));
    }
}
